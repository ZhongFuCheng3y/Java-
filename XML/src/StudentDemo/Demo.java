package StudentDemo;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by asd on 2016/10/24.
 */
        public class Demo {
            public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

                Scanner scanner = new Scanner(System.in);

                StudentService studentService = new StudentService();

                //��ʾ��������
                System.out.println("�鿴����ѧ���ĳɼ�------view");
                System.out.println("����ѧ��id�����ѯѧ���ɼ�-----view of");
                System.out.println("���һ��ѧ��-----add");
                System.out.println("����id����һ��ѧ������Ϣ-----change");
                System.out.println("����idȥɾ��һ��ѧ��------remove");
                System.out.println("����ѧ����Ϣ-----save");
                System.out.println("�˳�ϵͳ--------exit");

                //��ȡ�û�ϣ����ʲô
                String operType = scanner.nextLine();

        if (operType.equals("view")) {
            System.out.println("����ѧ���ĳɼ�����:");
            studentService.showStudentsFen();
        }

    }
}

//Service��
class StudentService {


    public Document getDocument(String fullfilename) throws IOException, SAXException, ParserConfigurationException {
        //�õ�DocumentBuilderFactory
        DocumentBuilderFactory documentBuilderFactory
                = DocumentBuilderFactory.newInstance();

        //�õ�DocumentBuilder
        DocumentBuilder documentBuilder
                = documentBuilderFactory.newDocumentBuilder();

        //ָ��������һ���ļ�
        return documentBuilder.parse(fullfilename);

    }

    //��ʾ����ѧ���ɼ��ķ���
    public void showStudentsFen() throws ParserConfigurationException, IOException, SAXException {

        //��ʾѧ����������Ϣ
        NodeList nodeList
                = getDocument("D:\\XML\\src\\StudentDemo\\stus.xml").getElementsByTagName("student");

        //����NodeList
        for (int i = 0; i < nodeList.getLength(); i++) {
            //����Element����ķ�����,�������ǰ�Node����ת����Element
            Element element = (Element) nodeList.item(i);

            //���ѧ������Ϣ
            /*��ʱelement��ѧ��,�������ǿ��Կ��ȡ��ѧ�����ӱ�ǩ*/
            System.out.println("���:   " + element.getAttribute("sid") +
                    "������:      " + "    " + getFirstElementTextVal(element, "name") +
                    "java�ɼ���:    " + "   " + getFirstElementTextVal(element, "java") +
                    "oracle�ɼ���:   " + "    " + getFirstElementTextVal(element, "oracle") +
                    "vb�ĳɼ���:     " + getFirstElementTextVal(element, "vb"));

        }
    }

    public String getFirstElementTextVal(Element element, String name) {
        /*��Ϊ����֪��ֻ��һ��Ԫ��,���ԾͲ���Ҫ�ٱ�����,ֱ��ȡ����һ��*/
        return (element.getElementsByTagName(name).item(0)).getTextContent();
    }

}


//ѧ����
class Student {
    private String sid;
    private String name;
    private int my_java;
    private int my_oracle;
    private int my_vb;


    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMy_java() {
        return my_java;
    }

    public void setMy_java(int my_java) {
        this.my_java = my_java;
    }

    public int getMy_oracle() {
        return my_oracle;
    }

    public void setMy_oracle(int my_oracle) {
        this.my_oracle = my_oracle;
    }

    public int getMy_vb() {
        return my_vb;
    }

    public void setMy_vb(int my_vb) {
        this.my_vb = my_vb;
    }
}
