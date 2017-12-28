package 删除功能;

/**
 * Created by asd on 2016/9/6.
 */

import java.io.File;
import java.io.IOException;

/**
 * public boolean delete()
 */
/*
    要点:
        1:如果你创建文件或文件夹忘了写盘符路径,那么,默认在项目路径
        2:java删除不走回收站
        3:删除一个文件夹,请注意该文件不能包含文件或文件夹
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {

        //创建文件
        File file = new File("a.txt");
        System.out.println("createNewFile:" + file.createNewFile());

        File file2 = new File("aaa\\bbb\\ccc");
        System.out.println("mkdirs: " + file2.mkdirs());

        //我要删除a.txt这个文件
        //直接使用file引用变量也行,可以不用重新new一个file3
        File file3 = new File("a.txt");
        System.out.println("delete:" + file.delete());

        //我要删除ccc文件夹
        File file4 = new File("aaa\\bbb\\ccc");
        System.out.println("delete:" + file4.delete());

        //现在我想删除aaa文件夹,我必须要先删除bbb文件夹.不然就会出错.



    }
}
