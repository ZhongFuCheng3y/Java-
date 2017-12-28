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
    //读取xml文档数据：<书名>Java就业培训教程</书名>
    public void read() throws Exception{

        //获取解析器,拿到文档对象
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src/book1.xml"));

        //获取根节点
        Element root = document.getRootElement();

        Element bookName = root.element("书").element("书名");
        String value = bookName.getText();

        System.out.println(value);
    }


    @Test
    //读取xml文档的属性---<书 你是不是傻="我的天">
    public void readAttribute() throws Exception {
        SAXReader saxReader = new SAXReader();

        Document document = saxReader.read(new File("src/book1.xml"));

        //获取到书节点
        Element book = document.getRootElement().element("书");
        String value = book.attributeValue("你是不是傻");
        System.out.println(value);
    }

    @Test
    //向xml文档中添加<售价>19元</售价>
    public void add() throws Exception {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src/book1.xml"));

        Element book = document.getRootElement().element("书");

        Element price = DocumentHelper.createElement("售价");
        price.setText("29块钱啊");
        book.add(price);

        //更新操作

        //指定样式和编码
        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("utf-8");

        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("src/book1.xml"), outputFormat);

        xmlWriter.write(document);
        xmlWriter.close();

    }

    @Test
    //修改：<售价>109</售价>  为209

    public void update() throws  Exception {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src/book1.xml"));

        //获取到售价的节点
        Element price = (Element) document.getRootElement().element("书").elements("售价").get(0);
        price.setText("我要卖100块");

        //更新

        //指定样式和编码
        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("utf-8");

        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("src/book1.xml"), outputFormat);
        xmlWriter.write(document);
        xmlWriter.close();

    }

    @Test
    //删除:<售价>109</售价>
    public void delete() throws Exception {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src/book1.xml"));

        //获取售价节点
        Element price = (Element) document.getRootElement().element("书").elements("售价").get(0);

        price.getParent().remove(price);


        //更新
        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("utf-8");

        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("src/book1.xml"), outputFormat);

        xmlWriter.write(document);
        xmlWriter.close();

    }

    @Test
    //使用XPATH技术,查找节点
    public void findWithXpath() throws Exception {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src/book1.xml"));

        Element book = (Element) document.selectNodes("//书名").get(0);
        System.out.println(book.getText());

    }

}
