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
/*��SAX����XML�ĵ�*/
/*
* ����:
*   1:��ȡSAX��������
*   2:����SAX�����ȡ������
*
* */
public class demo {
        public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

            //��ȡSAX��������
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

            //����SAX�����ȡ������
            SAXParser saxParser = saxParserFactory.newSAXParser();

            //��xml�ļ����¼�����������
            saxParser.parse("D:\\XML\\src\\saxXML\\class.xml", new MyDefaultHandler2());

        }


}
//ֻ��ʾѧ�������������
/*
* ����:
*   1:����������Ǳ���,isAge��isName
*   2:��startElement���ж�isAge��isName,���������,���Ǿ�����Ϊtrue
*   3:��character�������ж�,ֻ��isAge��isName����true��ȥ�������
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
        if (qName.equals("����")) {
            this.isName = true;
        } else if (qName.equals("����")) {
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

        /*���ñ����*/
        this.isAge = false;
        this.isName = false;
    }
}





//�����¼�������
class MyDefaultHandler1 extends DefaultHandler {
    /*�����ĵ���ʼ*/
    @Override
    public void startDocument() throws SAXException {

        super.startDocument();
    }

    /*����xml�ļ��е�һ��Ԫ��*/
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("Ԫ��������:"+qName);
        super.startElement(uri, localName, qName, attributes);

    }
    /*����xml�ļ��е��ı�*/
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        //ͨ���������ǿ��Է���,ch��������һ���ĵ�,start�ǵ�ǰԪ�صĿ�ʼ,length�ǵ�ǰԪ�صĳ���
        /*System.out.println(new String(ch, start, length));*/


        /*���Ƿ��ִ�ӡ����,�кܶ�Ŀ���,��ʱxml�ĸ�ʽ��ɵ�,����,���ǲ��뿴������,�����ж�һ��*/
        String con = new String(ch, start, length);
        if (!(con.trim()).equals("")) {
            System.out.println(con);
        }
    }
    /*����xml�ļ���һ��Ԫ�ؽ�����*/
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
    }
    /*���������ĵ�������.*/
    @Override
    public void endDocument() throws SAXException {

        super.endDocument();
    }






}

