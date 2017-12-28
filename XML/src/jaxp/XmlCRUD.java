package jaxp;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

/**
 * Created by asd on 2016/11/13.
 */
public class XmlCRUD {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        //获取工厂
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        //获取解析器
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        //解析XML文档，得到代表文档的document
        Document document = documentBuilder.parse(new File("src/book1.xml"));

        //read(document);
        //update(document);
        //insert(document);
        //insert2(document);
        //delete(document);
        //updateAttribute(document);
        list(document);


    }

    //得到售价节点的值
    public static void read(Document document) {

        //获取到售价节点
        NodeList nodeList = document.getElementsByTagName("售价");

        //取出第一个售价节点
        Node node = nodeList.item(0);

        //拿到售价节点的文本值
        String value = node.getTextContent();
        System.out.println(value);
    }

    //修改售价节点的值
    public static void update(Document document) throws TransformerException {

        //获取到售价节点
        Node node = document.getElementsByTagName("售价").item(0);
        node.setTextContent("99块");

        //上面只是把内存的值改变了，我们要把数据写到文件上

        //获取工厂
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        //获取对象
        Transformer transformer = transformerFactory.newTransformer();

        transformer.transform(new DOMSource(document), new StreamResult(new File("src/book1.xml")));
    }

    //向指定节点增加孩子节点
    public static void insert(Document document) throws TransformerException {
        Node node = document.getElementsByTagName("书").item(0);

        Element element = document.createElement("你好啊");

        element.setTextContent("我也好啊");

        node.appendChild(element);

        //更新
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer ts = tf.newTransformer();
        ts.transform(new DOMSource(document), new StreamResult(new File("src/book1.xml")));
    }

    //向指定位置增加节点
    public static void insert2(Document document) throws TransformerException {

        Element element = document.createElement("helllo");
        element.setTextContent("woreld");

        Node node = document.getElementsByTagName("书").item(0);

        node.insertBefore(element, document.getElementsByTagName("售价").item(1));

        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer ts = tf.newTransformer();
        ts.transform(new DOMSource(document), new StreamResult(new File("src/book1.xml")));
    }

    //删除xml文档的售价结点
    public static void delete(Document document) throws TransformerException {
        Node price = document.getElementsByTagName("售价").item(0);

        price.getParentNode().removeChild(price);

        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer ts = tf.newTransformer();
        ts.transform(new DOMSource(document), new StreamResult(new File("src/book1.xml")));
    }

    //操作xml文档属性
    public static void updateAttribute(Document document) throws TransformerException {

        //拿到book节点
        Node node = document.getElementsByTagName("书").item(0);

        //发现book节点的功能不够用，我们转换成是Element
        Element book = null;
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            book = (Element) node;
        }

        book.setAttribute("你是不是傻", "我的天");
        book.removeAttribute("name");

        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer ts = tf.newTransformer();
        ts.transform(new DOMSource(document), new StreamResult(new File("src/book1.xml")));

    }

    //遍历xml文档,传入的是Document,但是在后面遍历的时候,我们要用Node,所以参数变了Node[Document的父亲]
    public static void list(Node node) {
        //首先判断该节点是不是元素
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            System.out.println(node.getNodeName());
        }

        NodeList nodeList = node.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            //获取到孩子节点中的第一个节点
            Node chlidren_node = nodeList.item(i);

            //递归
            list(chlidren_node);
        }



    }

}
