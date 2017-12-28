package dao;

import domain.Student;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import utils.XMLUtils;

import java.io.IOException;

import static utils.XMLUtils.getDocument;

/**
 * Created by asd on 2016/11/14.
 */

/*
    <student examid="222" idcard="111">
		<name>张三</name>
		<location>沈阳</location>
		<grade>89</grade>
	</student>
* */
public class StudentForDom4j {

    //增加用户
    public void add(Student student) {

        try {
            Document document = getDocument();
            Element root = document.getRootElement();

            Element studentElement = DocumentHelper.createElement("student");
            studentElement.addAttribute("examid", student.getExamid());
            studentElement.addAttribute("idcard", student.getIdcard());

            //向指定结点上挂子结点的便捷方式
            studentElement.addElement("name").setText(student.getName());
            studentElement.addElement("location").setText(student.getLocation());
            studentElement.addElement("grade").setText(String.valueOf(student.getGrade()));

            root.add(studentElement);

            //更新
            XMLUtils.Write2Xml(document);


        } catch (DocumentException e) {

            throw new RuntimeException("你输入的是什么垃圾玩意");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //查找用户
    public Student find(String examid) {

        try {
            Document document = XMLUtils.getDocument();

            //用XPATH技术直接查找到用户
            Element element = (Element) document.selectSingleNode("//student[@examid='" + examid + "']");

            if (element != null) {
                Student student = new Student();
                student.setExamid(element.attributeValue("examid"));
                student.setIdcard(element.attributeValue("idcard"));
                student.setName(element.element("name").getText());
                student.setLocation(element.element("location").getText());
                student.setGrade(Integer.parseInt(element.element("grade").getText()));
                return student;
            }
            return null;

        } catch (Exception e) {
            throw new RuntimeException("你输入的啥玩意?");
        }


    }

}
