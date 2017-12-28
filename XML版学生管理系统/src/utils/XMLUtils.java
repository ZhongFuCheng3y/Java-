package utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by asd on 2016/11/14.
 */
public class XMLUtils {

    public static Document getDocument() throws DocumentException {

        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src/student.xml"));

        return document;
    }

    public static void Write2Xml(Document document) throws IOException {

        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("utf-8");

        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("src/student.xml"), outputFormat);
        xmlWriter.write(document);
        xmlWriter.close();
    }


}
