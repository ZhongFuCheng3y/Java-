package dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by asd on 2016/11/14.
 */
public class Demo1 {

    @Test
    //��ȡxml�ĵ����ݣ�<����>Java��ҵ��ѵ�̳�</����>
    public void read() throws Exception{

        //��ȡ������,�õ��ĵ�����
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src/book1.xml"));

        //��ȡ���ڵ�
        Element root = document.getRootElement();

        Element bookName = root.element("��").element("����");
        String value = bookName.getText();

        System.out.println(value);
    }


    @Test
    //��ȡxml�ĵ�������---<�� ���ǲ���ɵ="�ҵ���">
    public void readAttribute() throws Exception {
        SAXReader saxReader = new SAXReader();

        Document document = saxReader.read(new File("src/book1.xml"));

        //��ȡ����ڵ�
        Element book = document.getRootElement().element("��");
        String value = book.attributeValue("���ǲ���ɵ");
        System.out.println(value);
    }

    @Test
    //��xml�ĵ������<�ۼ�>19Ԫ</�ۼ�>
    public void add() throws Exception {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src/book1.xml"));

        Element book = document.getRootElement().element("��");

        Element price = DocumentHelper.createElement("�ۼ�");
        price.setText("29��Ǯ��");
        book.add(price);

        //���²���

        //ָ����ʽ�ͱ���
        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("utf-8");

        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("src/book1.xml"), outputFormat);

        xmlWriter.write(document);
        xmlWriter.close();

    }

    @Test
    //�޸ģ�<�ۼ�>109</�ۼ�>  Ϊ209

    public void update() throws  Exception {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src/book1.xml"));

        //��ȡ���ۼ۵Ľڵ�
        Element price = (Element) document.getRootElement().element("��").elements("�ۼ�").get(0);
        price.setText("��Ҫ��100��");

        //����

        //ָ����ʽ�ͱ���
        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("utf-8");

        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("src/book1.xml"), outputFormat);
        xmlWriter.write(document);
        xmlWriter.close();

    }

    @Test
    //ɾ��:<�ۼ�>109</�ۼ�>
    public void delete() throws Exception {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src/book1.xml"));

        //��ȡ�ۼ۽ڵ�
        Element price = (Element) document.getRootElement().element("��").elements("�ۼ�").get(0);

        price.getParent().remove(price);


        //����
        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("utf-8");

        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("src/book1.xml"), outputFormat);

        xmlWriter.write(document);
        xmlWriter.close();

    }

    @Test
    //ʹ��XPATH����,���ҽڵ�
    public void findWithXpath() throws Exception {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src/book1.xml"));

        Element book = (Element) document.selectNodes("//����").get(0);
        System.out.println(book.getText());

    }

}
