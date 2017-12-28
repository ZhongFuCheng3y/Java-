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

                //显示操作界面
                System.out.println("查看所有学生的成绩------view");
                System.out.println("按照学生id号码查询学生成绩-----view of");
                System.out.println("添加一个学生-----add");
                System.out.println("按照id更改一个学生的信息-----change");
                System.out.println("按照id去删除一个学生------remove");
                System.out.println("保存学生信息-----save");
                System.out.println("退出系统--------exit");

                //获取用户希望干什么
                String operType = scanner.nextLine();

        if (operType.equals("view")) {
            System.out.println("所有学生的成绩如下:");
            studentService.showStudentsFen();
        }

    }
}

//Service类
class StudentService {


    public Document getDocument(String fullfilename) throws IOException, SAXException, ParserConfigurationException {
        //得到DocumentBuilderFactory
        DocumentBuilderFactory documentBuilderFactory
                = DocumentBuilderFactory.newInstance();

        //得到DocumentBuilder
        DocumentBuilder documentBuilder
                = documentBuilderFactory.newDocumentBuilder();

        //指定解析哪一个文件
        return documentBuilder.parse(fullfilename);

    }

    //显示所有学生成绩的方法
    public void showStudentsFen() throws ParserConfigurationException, IOException, SAXException {

        //显示学生的所有信息
        NodeList nodeList
                = getDocument("D:\\XML\\src\\StudentDemo\\stus.xml").getElementsByTagName("student");

        //遍历NodeList
        for (int i = 0; i < nodeList.getLength(); i++) {
            //由于Element对象的方法多,所以我们把Node对象转成是Element
            Element element = (Element) nodeList.item(i);

            //输出学生的信息
            /*此时element是学生,但是我们可以跨层取出学生的子标签*/
            System.out.println("编号:   " + element.getAttribute("sid") +
                    "名字是:      " + "    " + getFirstElementTextVal(element, "name") +
                    "java成绩是:    " + "   " + getFirstElementTextVal(element, "java") +
                    "oracle成绩是:   " + "    " + getFirstElementTextVal(element, "oracle") +
                    "vb的成绩是:     " + getFirstElementTextVal(element, "vb"));

        }
    }

    public String getFirstElementTextVal(Element element, String name) {
        /*因为我们知道只有一个元素,所以就不需要再遍历了,直接取出第一个*/
        return (element.getElementsByTagName(name).item(0)).getTextContent();
    }

}


//学生类
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
