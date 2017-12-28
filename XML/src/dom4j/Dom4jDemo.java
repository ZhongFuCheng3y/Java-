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
        /*得到解析器*/
        SAXReader saxReader = new SAXReader();

        /*指定解析哪一个文件*/
        Document document = saxReader.read(new File("D:\\XML\\src\\dom4j\\class.xml"));


        /*得到根元素,遍历xml文件*/
        /*list(document.getRootElement());*/
        //read(document);
        /*add(document);*/
        /*del(document);*/
        /*upd(document);*/
        //addByIndex(document);


    }


    /*遍历整一个文档*/
    public static void list(Element element) {

        System.out.println(element.getName() + element.getTextTrim());


        Iterator iterator = element.elementIterator();

        while (iterator.hasNext()) {
            Element element1 = (Element) iterator.next();

            //递归
            list(element1);
        }

    }

    /*指定去读取某一个元素,---读取第一个学生的信息*/
    public static void read(Document document) {

        /*
        * elements("学生")取出集合
        * element("学生")取出第一个学生信息
        *
        *
        * 如果明确取出第一个,可以不加"s"
        * */


        /*得到根元素*/
        Element rootElement = document.getRootElement();

        /*返回root元素下的学生元素的,get(0)表示取出第一个学生元素---*/
        Element element = (Element) rootElement.elements("学生").get(0);

        /*获取名字*/
        System.out.println(element.element("名字").getText());

        /*获取名字属性*/
        System.out.println(element.element("名字").attributeValue("别名"));


        /*
        * dom4j不能直接跨层取出元素------xpath可以解决的
        * */


    }

    /*添加一个学生到xml文件中*/
    public static void add(Document document) throws IOException {
        /*
        * 步骤:
        *   1:创建一个学生节点对象
        *   2:把三个子节点加载到学生节点对象去
        *   3:再把学生节点对象加载到根元素下
        *   4:把我们的xml文件更新一下
        * */
        Element element = DocumentHelper.createElement("学生");
        Element stu_name = DocumentHelper.createElement("名字");
        stu_name.setText("傻逼");
        stu_name.addAttribute("别名", "哦");
        Element stu_age = DocumentHelper.createElement("年龄");
        Element stu_intro = DocumentHelper.createElement("介绍");


        element.add(stu_name);
        element.add(stu_age);
        element.add(stu_intro);

        document.getRootElement().add(element);


        /*
        * 直接输出会出现中文乱码,所以我们要指定编码.
        * */
        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("utf-8");


        /*XMLWriter xmlWriter = new XMLWriter(new FileWriter("D:\\XML\\src\\dom4j\\class.xml"),outputFormat);*/
        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(new File("D:\\XML\\src\\dom4j\\class.xml")), outputFormat);
        xmlWriter.write(document);
        xmlWriter.close();


    }


    /*删除元素::删除第一个学生*/
    public static void del(Document document) throws Exception {

        /*
        * 步骤:
        *   1:找到元素
        *   2:删除--用父节点删除
        *   3:更新文件
        * */


        /*删除元素的某个属性*/
        Element student = document.getRootElement().element("学生").element("名字");
        student.remove(student.attribute("别名"));

        /*删除元素*/
        /*Element student = document.getRootElement().element("学生");*/
        //student.getParent().remove(student);


        /*
        * 直接输出会出现中文乱码,所以我们要指定编码.
        * */
        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("utf-8");


        /*XMLWriter xmlWriter = new XMLWriter(new FileWriter("D:\\XML\\src\\dom4j\\class.xml"),outputFormat);*/
        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(new File("D:\\XML\\src\\dom4j\\class.xml")), outputFormat);
        xmlWriter.write(document);
        xmlWriter.close();


    }


    /*把所有的年龄增加3岁*/
    public static void upd(Document document) throws Exception {

        /*
        * 步骤:
        *   1:得到所有学生的年龄
        *       a:先得到学生的元素
        *       b:获取元素下来的属性,拿到文本,再运算
        *
        * */


        List<Element> stuList = document.getRootElement().elements("学生");

        for (Element element : stuList) {
            Element age = element.element("年龄");




            /*先转为int类型,再转回String类型*/
            age.setText((Integer.parseInt(age.getText()) + 3) + "");

            /*改变属性值*/
            Element name = element.element("名字");

            //name.setAttributeValue("别名", "helloworld");
            name.addAttribute("别名", "okok");
        }

        /*更新*/

        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("utf-8");

        /*XMLWriter xmlWriter = new XMLWriter(new FileWriter("D:\\XML\\src\\dom4j\\class.xml"),outputFormat);*/
        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(new File("D:\\XML\\src\\dom4j\\class.xml")), outputFormat);
        xmlWriter.write(document);
        xmlWriter.close();
    }


    /*添加一个元素到指定位置*/
    public static void addByIndex(Document document) throws Exception {

        /*创建一个元素*/
        Element newHero = DocumentHelper.createElement("学生");
        newHero.setText("林冲");

        /*得到所有学生的List*/
        List allHeros = document.getRootElement().elements("学生");
        /*allHeros.add(1, newHero);*/


        /*取出所有人的名字*/
        for (int i = 0; i < allHeros.size(); i++) {

            Element name = ((Element) allHeros.get(i)).element("名字");

            if (name.getText().equals("卢津艺")) {
                /*插入一个数,这里size会添加多一个,但是上面是察觉不出来的,所以添加完就要break*/
                allHeros.add(i+1, newHero);
                break;
            }

        }

        /*更新*/

        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("utf-8");

        /*XMLWriter xmlWriter = new XMLWriter(new FileWriter("D:\\XML\\src\\dom4j\\class.xml"),outputFormat);*/
        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(new File("D:\\XML\\src\\dom4j\\class.xml")), outputFormat);
        xmlWriter.write(document);
        xmlWriter.close();


    }

}

