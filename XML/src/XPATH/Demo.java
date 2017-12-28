package XPATH;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * Created by asd on 2016/10/26.
 */
public class Demo {
    public static void main(String[] args) throws DocumentException {

        /*�õ�SAXReader������*/
        SAXReader saxReader = new SAXReader();

        /*ָ��������һ���ļ�*/
        Document document = saxReader.read("D:\\XML\\src\\XPATH\\test.xml");

        /*�õ���Ԫ��*/
        /*Element root = document.getRootElement();*/

        /*ʹ��xpath��������*/
        /*�������ȷ��ֻ��һ��Node,�����ʹ��singleNode()*/
        Element element1 = (Element) document.selectSingleNode("/AAA/BBB[2]");
        System.out.println(element1.getText());

    }
}
