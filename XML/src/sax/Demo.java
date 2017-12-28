package sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/**
 * Created by asd on 2016/11/13.
 */
public class Demo {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        //获取reader对象
        XMLReader xmlReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();

        //设置事件处理器
        xmlReader.setContentHandler(new MyHandler());

        xmlReader.parse("src/book1.xml");
    }

}

//用于获取第一个售价节点的值：<售价>109</售价>
class MyHandler extends DefaultHandler {

    //设置标识量
    boolean b = false;
    int index = 1;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if (qName.equals("售价")) {
            b = true;

        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
       //结束时,应该改变标识量
        if (qName.equals("售价")) {
            b = false;
            index++;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (b == true && index == 1) {
            System.out.println(new String(ch, start, length));
        }


    }
}
