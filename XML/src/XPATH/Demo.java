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

        /*得到SAXReader解析器*/
        SAXReader saxReader = new SAXReader();

        /*指定解析哪一个文件*/
        Document document = saxReader.read("D:\\XML\\src\\XPATH\\test.xml");

        /*得到根元素*/
        /*Element root = document.getRootElement();*/

        /*使用xpath随心所欲*/
        /*如果我们确定只有一个Node,则可以使用singleNode()*/
        Element element1 = (Element) document.selectSingleNode("/AAA/BBB[2]");
        System.out.println(element1.getText());

    }
}
