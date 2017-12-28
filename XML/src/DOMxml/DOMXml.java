package DOMxml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 * Created by asd on 2016/10/24.
 */
/*
*
* 步骤:
*   1:获取解析器工厂对象--DocumentBuilderFactory.instance()
*   2:通过解析器工厂对象,获取解析器对象
*   3:指定解析哪一个xml文件
* */
public class DOMXml {
    public static void main(String[] args) throws Exception {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        Document document = documentBuilder.parse("D:\\XML\\src\\DOMxml\\class.xml");

        //list(document);
        /*read(document);*/
        //add(document);
        //del(document);
        update(document);

    }

    /*添加一个学生到xml文件中*/
    public static void add(Document document) throws TransformerException {
        //创建一个新的学生节点
         Element newStu = document.createElement("学生");

        //给学生添加一个属性值
        newStu.setAttribute("sex", "人妖");

        //这是他们的子节点
        Element newStu_name = document.createElement("名字");
        Element newStu_age = document.createElement("年龄");
        Element newStu_intro = document.createElement("介绍");

        //把子节点添加进去
        newStu.appendChild(newStu_name);
        newStu.appendChild(newStu_age);
        newStu.appendChild(newStu_intro);


        //添加内容
        newStu_name.setTextContent("你傻逼");
        newStu_age.setTextContent("34");
        newStu_intro.setTextContent("这是一个傻逼");

        //把新的学生节点添加到根元素下
        document.getDocumentElement().appendChild(newStu);

        //下面是更新操作
        //先得到TransformerFactory对象
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        //通过TransformerFactory对象得到一个转换器
        Transformer transformer = transformerFactory.newTransformer();

        transformer.transform(new DOMSource(document), new StreamResult("D:\\XML\\src\\DOMxml\\class2.xml"));
    }


    /*显示第一个学生的所有信息*/
    /*获取属性值*/
    public static void read(Document document) {
        NodeList nodeList = document.getElementsByTagName("学生");

        /*取出第一个学生*/
        /*Node和Element是父子关系,可以把Node类型强转为Element,转为Element就是为了用它的方法*/
        Element stu = (Element) nodeList.item(0);

        /*属性值:*/
        System.out.println("学生的性别是:" + stu.getAttribute("sex"));

        Element name = (Element) stu.getElementsByTagName("名字").item(0);

        //获取名字的内容
        System.out.println(name.getTextContent());

    }


    /*遍历xml文件*/
    public static void list(Node node) {
        /*这里判断是不是元素节点,不然是有空格的文本节点的.*/
        if (node.getNodeType() == node.ELEMENT_NODE) {
            System.out.println(node.getNodeName());
        }
        //取出node的子节点
        NodeList nodeList = node.getChildNodes();

        /*这里递归的结束方式就是判读有没有子节点,没有子节点,就不进入for语句中了*/
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node nodes = nodeList.item(i);
            //这里就是递归了
            list(nodes);
        }
    }

    /* 删除一个元素(删除第一个学生)*/
    public static void del(Document document) throws Exception {
        //首先要找到第一个学生
        Element node = (Element) document.getElementsByTagName("学生").item(0);

        //找到学生的父节点,再通过父节点删除子节点,这样就会做得更全面
        //node.getParentNode().removeChild(node);

        /*删除学生的sex属性*/
        node.removeAttribute("sex");


        //先得到TransformerFactory对象
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        //通过TransformerFactory对象得到一个转换器
        Transformer transformer = transformerFactory.newTransformer();

        transformer.transform(new DOMSource(document), new StreamResult("D:\\XML\\src\\DOMxml\\class2.xml"));

    }

    /*更新操作*/
    public static void update(Document document) throws Exception {

        //先找到该元素
        Element node = (Element) document.getElementsByTagName("学生").item(0);
        Element node_name = (Element) node.getElementsByTagName("名字").item(0);

        node_name.setTextContent("宋江");


        //先得到TransformerFactory对象
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        //通过TransformerFactory对象得到一个转换器
        Transformer transformer = transformerFactory.newTransformer();

        transformer.transform(new DOMSource(document), new StreamResult("D:\\XML\\src\\DOMxml\\class2.xml"));

        }
}
