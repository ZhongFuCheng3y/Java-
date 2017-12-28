package NIO��;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by asd on 2016/9/12.
 */
/*
    nio����jdk4������,�����IO���Ĳ���Ч��

    jdk7֮���nio:
        1:Path:·��
        2:Paths:��һ����̬�ķ�������һ��·��
                public static Path get(URI uri)
        3:Files:�ṩ�˾�̬����������ʹ��
                public static long copy(Path, source, OutputStream out):�����ļ�
                public static Path write(Path path,Iterable<? extends CharSequence> lines,Charset cs,OpenOption... options)
 */
public class NIODemo {

    public static void main(String[] args) throws IOException {
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");
        Files.write(Paths.get("array.txt"), array, Charset.forName("GBK"));

    }

}
