package NIO包;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by asd on 2016/9/12.
 */
/*
    nio包在jdk4出现了,提高了IO流的操作效率

    jdk7之后的nio:
        1:Path:路径
        2:Paths:有一个静态的方法返回一个路径
                public static Path get(URI uri)
        3:Files:提供了静态方法供我们使用
                public static long copy(Path, source, OutputStream out):复制文件
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
