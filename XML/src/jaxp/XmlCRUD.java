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
        //��ȡ����
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        //��ȡ������
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        //����XML�ĵ����õ������ĵ���document
        Document document = documentBuilder.parse(new File("src/book1.xml"));

        //read(document);
        //update(document);
        //insert(document);
        //insert2(document);
        //delete(document);
        //updateAttribute(document);
        list(document);


    }

    //�õ��ۼ۽ڵ��ֵ
    public static void read(Document document) {

        //��ȡ���ۼ۽ڵ�
        NodeList nodeList = document.getElementsByTagName("�ۼ�");

        //ȡ����һ���ۼ۽ڵ�
        Node node = nodeList.item(0);

        //�õ��ۼ۽ڵ���ı�ֵ
        String value = node.getTextContent();
        System.out.println(value);
    }

    //�޸��ۼ۽ڵ��ֵ
    public static void update(Document document) throws TransformerException {

        //��ȡ���ۼ۽ڵ�
        Node node = document.getElementsByTagName("�ۼ�").item(0);
        node.setTextContent("99��");

        //����ֻ�ǰ��ڴ��ֵ�ı��ˣ�����Ҫ������д���ļ���

        //��ȡ����
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        //��ȡ����
        Transformer transformer = transformerFactory.newTransformer();

        transformer.transform(new DOMSource(document), new StreamResult(new File("src/book1.xml")));
    }

    //��ָ���ڵ����Ӻ��ӽڵ�
    public static void insert(Document document) throws TransformerException {
        Node node = document.getElementsByTagName("��").item(0);

        Element element = document.createElement("��ð�");

        element.setTextContent("��Ҳ�ð�");

        node.appendChild(element);

        //����
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer ts = tf.newTransformer();
        ts.transform(new DOMSource(document), new StreamResult(new File("src/book1.xml")));
    }

    //��ָ��λ�����ӽڵ�
    public static void insert2(Document document) throws TransformerException {

        Element element = document.createElement("helllo");
        element.setTextContent("woreld");

        Node node = document.getElementsByTagName("��").item(0);

        node.insertBefore(element, document.getElementsByTagName("�ۼ�").item(1));

        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer ts = tf.newTransformer();
        ts.transform(new DOMSource(document), new StreamResult(new File("src/book1.xml")));
    }

    //ɾ��xml�ĵ����ۼ۽��
    public static void delete(Document document) throws TransformerException {
        Node price = document.getElementsByTagName("�ۼ�").item(0);

        price.getParentNode().removeChild(price);

        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer ts = tf.newTransformer();
        ts.transform(new DOMSource(document), new StreamResult(new File("src/book1.xml")));
    }

    //����xml�ĵ�����
    public static void updateAttribute(Document document) throws TransformerException {

        //�õ�book�ڵ�
        Node node = document.getElementsByTagName("��").item(0);

        //����book�ڵ�Ĺ��ܲ����ã�����ת������Element
        Element book = null;
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            book = (Element) node;
        }

        book.setAttribute("���ǲ���ɵ", "�ҵ���");
        book.removeAttribute("name");

        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer ts = tf.newTransformer();
        ts.transform(new DOMSource(document), new StreamResult(new File("src/book1.xml")));

    }

    //����xml�ĵ�,�������Document,�����ں��������ʱ��,����Ҫ��Node,���Բ�������Node[Document�ĸ���]
    public static void list(Node node) {
        //�����жϸýڵ��ǲ���Ԫ��
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            System.out.println(node.getNodeName());
        }

        NodeList nodeList = node.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            //��ȡ�����ӽڵ��еĵ�һ���ڵ�
            Node chlidren_node = nodeList.item(i);

            //�ݹ�
            list(chlidren_node);
        }



    }

}
