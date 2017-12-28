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
* ����:
*   1:��ȡ��������������--DocumentBuilderFactory.instance()
*   2:ͨ����������������,��ȡ����������
*   3:ָ��������һ��xml�ļ�
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

    /*���һ��ѧ����xml�ļ���*/
    public static void add(Document document) throws TransformerException {
        //����һ���µ�ѧ���ڵ�
         Element newStu = document.createElement("ѧ��");

        //��ѧ�����һ������ֵ
        newStu.setAttribute("sex", "����");

        //�������ǵ��ӽڵ�
        Element newStu_name = document.createElement("����");
        Element newStu_age = document.createElement("����");
        Element newStu_intro = document.createElement("����");

        //���ӽڵ���ӽ�ȥ
        newStu.appendChild(newStu_name);
        newStu.appendChild(newStu_age);
        newStu.appendChild(newStu_intro);


        //�������
        newStu_name.setTextContent("��ɵ��");
        newStu_age.setTextContent("34");
        newStu_intro.setTextContent("����һ��ɵ��");

        //���µ�ѧ���ڵ���ӵ���Ԫ����
        document.getDocumentElement().appendChild(newStu);

        //�����Ǹ��²���
        //�ȵõ�TransformerFactory����
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        //ͨ��TransformerFactory����õ�һ��ת����
        Transformer transformer = transformerFactory.newTransformer();

        transformer.transform(new DOMSource(document), new StreamResult("D:\\XML\\src\\DOMxml\\class2.xml"));
    }


    /*��ʾ��һ��ѧ����������Ϣ*/
    /*��ȡ����ֵ*/
    public static void read(Document document) {
        NodeList nodeList = document.getElementsByTagName("ѧ��");

        /*ȡ����һ��ѧ��*/
        /*Node��Element�Ǹ��ӹ�ϵ,���԰�Node����ǿתΪElement,תΪElement����Ϊ�������ķ���*/
        Element stu = (Element) nodeList.item(0);

        /*����ֵ:*/
        System.out.println("ѧ�����Ա���:" + stu.getAttribute("sex"));

        Element name = (Element) stu.getElementsByTagName("����").item(0);

        //��ȡ���ֵ�����
        System.out.println(name.getTextContent());

    }


    /*����xml�ļ�*/
    public static void list(Node node) {
        /*�����ж��ǲ���Ԫ�ؽڵ�,��Ȼ���пո���ı��ڵ��.*/
        if (node.getNodeType() == node.ELEMENT_NODE) {
            System.out.println(node.getNodeName());
        }
        //ȡ��node���ӽڵ�
        NodeList nodeList = node.getChildNodes();

        /*����ݹ�Ľ�����ʽ�����ж���û���ӽڵ�,û���ӽڵ�,�Ͳ�����for�������*/
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node nodes = nodeList.item(i);
            //������ǵݹ���
            list(nodes);
        }
    }

    /* ɾ��һ��Ԫ��(ɾ����һ��ѧ��)*/
    public static void del(Document document) throws Exception {
        //����Ҫ�ҵ���һ��ѧ��
        Element node = (Element) document.getElementsByTagName("ѧ��").item(0);

        //�ҵ�ѧ���ĸ��ڵ�,��ͨ�����ڵ�ɾ���ӽڵ�,�����ͻ����ø�ȫ��
        //node.getParentNode().removeChild(node);

        /*ɾ��ѧ����sex����*/
        node.removeAttribute("sex");


        //�ȵõ�TransformerFactory����
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        //ͨ��TransformerFactory����õ�һ��ת����
        Transformer transformer = transformerFactory.newTransformer();

        transformer.transform(new DOMSource(document), new StreamResult("D:\\XML\\src\\DOMxml\\class2.xml"));

    }

    /*���²���*/
    public static void update(Document document) throws Exception {

        //���ҵ���Ԫ��
        Element node = (Element) document.getElementsByTagName("ѧ��").item(0);
        Element node_name = (Element) node.getElementsByTagName("����").item(0);

        node_name.setTextContent("�ν�");


        //�ȵõ�TransformerFactory����
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        //ͨ��TransformerFactory����õ�һ��ת����
        Transformer transformer = transformerFactory.newTransformer();

        transformer.transform(new DOMSource(document), new StreamResult("D:\\XML\\src\\DOMxml\\class2.xml"));

        }
}
