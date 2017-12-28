package 重命名功能;

/**
 * Created by asd on 2016/9/6.
 */

import java.io.File;
import java.io.IOException;

/**
 * public boolean renameTo(File dest)
 */
/*
    要点:
        1:路径名相同,改名
        2:路径名不同,改名并剪切
        3:绝对路径:以盘符开始
        4:相对路径:不以盘符开始
 */
public class FileDemo {

    public static void main(String[] args) throws IOException {

        //创建一个文件对象
        File file = new File("a.txt");
        file.createNewFile();

        //我要修改这个文件名是b.txt
        //File newFile = new File("b.txt");
        //System.out.println("renameTo:" +file.renameTo(newFile));

        //--------------------------------------------------------
        File file2 = new File("a.txt");
        File newFile2 = new File("e:\\b.txt");
        System.out.println("renameTo:" + file2.renameTo(newFile2));

    }
}
