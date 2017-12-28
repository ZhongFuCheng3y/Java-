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

        //��ȡreader����
        XMLReader xmlReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();

        //�����¼�������
        xmlReader.setContentHandler(new MyHandler());

        xmlReader.parse("src/book1.xml");
    }

}

//���ڻ�ȡ��һ���ۼ۽ڵ��ֵ��<�ۼ�>109</�ۼ�>
class MyHandler extends DefaultHandler {

    //���ñ�ʶ��
    boolean b = false;
    int index = 1;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if (qName.equals("�ۼ�")) {
            b = true;

        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
       //����ʱ,Ӧ�øı��ʶ��
        if (qName.equals("�ۼ�")) {
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
