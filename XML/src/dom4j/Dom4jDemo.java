package dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 * Created by asd on 2016/10/24.
 */
public class Dom4jDemo {
    public static void main(String[] args) throws Exception {
        /*�õ�������*/
        SAXReader saxReader = new SAXReader();

        /*ָ��������һ���ļ�*/
        Document document = saxReader.read(new File("D:\\XML\\src\\dom4j\\class.xml"));


        /*�õ���Ԫ��,����xml�ļ�*/
        /*list(document.getRootElement());*/
        //read(document);
        /*add(document);*/
        /*del(document);*/
        /*upd(document);*/
        //addByIndex(document);


    }


    /*������һ���ĵ�*/
    public static void list(Element element) {

        System.out.println(element.getName() + element.getTextTrim());


        Iterator iterator = element.elementIterator();

        while (iterator.hasNext()) {
            Element element1 = (Element) iterator.next();

            //�ݹ�
            list(element1);
        }

    }

    /*ָ��ȥ��ȡĳһ��Ԫ��,---��ȡ��һ��ѧ������Ϣ*/
    public static void read(Document document) {

        /*
        * elements("ѧ��")ȡ������
        * element("ѧ��")ȡ����һ��ѧ����Ϣ
        *
        *
        * �����ȷȡ����һ��,���Բ���"s"
        * */


        /*�õ���Ԫ��*/
        Element rootElement = document.getRootElement();

        /*����rootԪ���µ�ѧ��Ԫ�ص�,get(0)��ʾȡ����һ��ѧ��Ԫ��---*/
        Element element = (Element) rootElement.elements("ѧ��").get(0);

        /*��ȡ����*/
        System.out.println(element.element("����").getText());

        /*��ȡ��������*/
        System.out.println(element.element("����").attributeValue("����"));


        /*
        * dom4j����ֱ�ӿ��ȡ��Ԫ��------xpath���Խ����
        * */


    }

    /*���һ��ѧ����xml�ļ���*/
    public static void add(Document document) throws IOException {
        /*
        * ����:
        *   1:����һ��ѧ���ڵ����
        *   2:�������ӽڵ���ص�ѧ���ڵ����ȥ
        *   3:�ٰ�ѧ���ڵ������ص���Ԫ����
        *   4:�����ǵ�xml�ļ�����һ��
        * */
        Element element = DocumentHelper.createElement("ѧ��");
        Element stu_name = DocumentHelper.createElement("����");
        stu_name.setText("ɵ��");
        stu_name.addAttribute("����", "Ŷ");
        Element stu_age = DocumentHelper.createElement("����");
        Element stu_intro = DocumentHelper.createElement("����");


        element.add(stu_name);
        element.add(stu_age);
        element.add(stu_intro);

        document.getRootElement().add(element);


        /*
        * ֱ������������������,��������Ҫָ������.
        * */
        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("utf-8");


        /*XMLWriter xmlWriter = new XMLWriter(new FileWriter("D:\\XML\\src\\dom4j\\class.xml"),outputFormat);*/
        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(new File("D:\\XML\\src\\dom4j\\class.xml")), outputFormat);
        xmlWriter.write(document);
        xmlWriter.close();


    }


    /*ɾ��Ԫ��::ɾ����һ��ѧ��*/
    public static void del(Document document) throws Exception {

        /*
        * ����:
        *   1:�ҵ�Ԫ��
        *   2:ɾ��--�ø��ڵ�ɾ��
        *   3:�����ļ�
        * */


        /*ɾ��Ԫ�ص�ĳ������*/
        Element student = document.getRootElement().element("ѧ��").element("����");
        student.remove(student.attribute("����"));

        /*ɾ��Ԫ��*/
        /*Element student = document.getRootElement().element("ѧ��");*/
        //student.getParent().remove(student);


        /*
        * ֱ������������������,��������Ҫָ������.
        * */
        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("utf-8");


        /*XMLWriter xmlWriter = new XMLWriter(new FileWriter("D:\\XML\\src\\dom4j\\class.xml"),outputFormat);*/
        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(new File("D:\\XML\\src\\dom4j\\class.xml")), outputFormat);
        xmlWriter.write(document);
        xmlWriter.close();


    }


    /*�����е���������3��*/
    public static void upd(Document document) throws Exception {

        /*
        * ����:
        *   1:�õ�����ѧ��������
        *       a:�ȵõ�ѧ����Ԫ��
        *       b:��ȡԪ������������,�õ��ı�,������
        *
        * */


        List<Element> stuList = document.getRootElement().elements("ѧ��");

        for (Element element : stuList) {
            Element age = element.element("����");




            /*��תΪint����,��ת��String����*/
            age.setText((Integer.parseInt(age.getText()) + 3) + "");

            /*�ı�����ֵ*/
            Element name = element.element("����");

            //name.setAttributeValue("����", "helloworld");
            name.addAttribute("����", "okok");
        }

        /*����*/

        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("utf-8");

        /*XMLWriter xmlWriter = new XMLWriter(new FileWriter("D:\\XML\\src\\dom4j\\class.xml"),outputFormat);*/
        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(new File("D:\\XML\\src\\dom4j\\class.xml")), outputFormat);
        xmlWriter.write(document);
        xmlWriter.close();
    }


    /*���һ��Ԫ�ص�ָ��λ��*/
    public static void addByIndex(Document document) throws Exception {

        /*����һ��Ԫ��*/
        Element newHero = DocumentHelper.createElement("ѧ��");
        newHero.setText("�ֳ�");

        /*�õ�����ѧ����List*/
        List allHeros = document.getRootElement().elements("ѧ��");
        /*allHeros.add(1, newHero);*/


        /*ȡ�������˵�����*/
        for (int i = 0; i < allHeros.size(); i++) {

            Element name = ((Element) allHeros.get(i)).element("����");

            if (name.getText().equals("¬����")) {
                /*����һ����,����size����Ӷ�һ��,���������ǲ����������,����������Ҫbreak*/
                allHeros.add(i+1, newHero);
                break;
            }

        }

        /*����*/

        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("utf-8");

        /*XMLWriter xmlWriter = new XMLWriter(new FileWriter("D:\\XML\\src\\dom4j\\class.xml"),outputFormat);*/
        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(new File("D:\\XML\\src\\dom4j\\class.xml")), outputFormat);
        xmlWriter.write(document);
        xmlWriter.close();


    }

}

