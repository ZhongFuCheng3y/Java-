package saxXML;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/**
 * Created by asd on 2016/10/24.
 */
/*用SAX解析XML文档*/
/*
* 步骤:
*   1:获取SAX工厂对象
*   2:根据SAX对象获取解析器
*
* */
public class demo {
        public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

            //获取SAX工厂对象
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

            //根据SAX对象获取解析器
            SAXParser saxParser = saxParserFactory.newSAXParser();

            //把xml文件和事件处理对象关联
            saxParser.parse("D:\\XML\\src\\saxXML\\class.xml", new MyDefaultHandler2());

        }


}
//只显示学生的年龄和名字
/*
* 步骤:
*   1:设置两个标记变量,isAge和isName
*   2:在startElement中判断isAge和isName,如果出现了,我们就设置为true
*   3:在character中增加判断,只有isAge和isName都是true才去输出内容
*
*
* */
class MyDefaultHandler2 extends DefaultHandler {
    private boolean isAge = false;
    private boolean isName = false;


    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("名字")) {
            this.isName = true;
        } else if (qName.equals("年龄")) {
            this.isAge = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        String con = new String(ch, start, length);
        if (!(con.trim()).equals("")&&(isAge||isName)) {
            System.out.println(con);
        }

        /*重置标记量*/
        this.isAge = false;
        this.isName = false;
    }
}





//创建事件处理类
class MyDefaultHandler1 extends DefaultHandler {
    /*发现文档开始*/
    @Override
    public void startDocument() throws SAXException {

        super.startDocument();
    }

    /*发现xml文件中的一个元素*/
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("元素名称是:"+qName);
        super.startElement(uri, localName, qName, attributes);

    }
    /*发现xml文件中的文本*/
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        //通过测试我们可以发现,ch代表了整一个文档,start是当前元素的开始,length是当前元素的长度
        /*System.out.println(new String(ch, start, length));*/


        /*我们发现打印出来,有很多的空行,这时xml的格式造成的,所以,我们不想看到空行,可以判断一下*/
        String con = new String(ch, start, length);
        if (!(con.trim()).equals("")) {
            System.out.println(con);
        }
    }
    /*发现xml文件中一个元素结束了*/
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
    }
    /*发现整个文档结束了.*/
    @Override
    public void endDocument() throws SAXException {

        super.endDocument();
    }






}

