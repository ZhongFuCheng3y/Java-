package 了解File类;

import java.io.File;

/**
 * Created by asd on 2016/9/6.
 */
/*
    操作IO前提:
        1:了解异常
        2:知道硬盘上文件的表现形式---File类
    File:
        文件和目录(文件夹)路径名的抽象表示形式

    构造方法:
        1:File(String pathname):根据一个路径得到File对象
        2:File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
        3:File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
 */
public class FileDemo {

    public static void main(String[] args) {

        //根据一个路径得到File对象---把路径封装成一个File对象
        File file = new File("E:\\java刘意\\day19\\code");

        //根据一个目录,和一个子文件/目录得到File对象
        File file2 = new File("E:\\java刘意\\day19", "code");

        //根据一个父File对象和一个子文件/目录得到File对象
        File file3 = new File("E:\\java刘意\\day19");
        File file4 = new File(file3 , "code");

        //new出来的对象肯定是不一样的.
        System.out.println(file==file2);
        System.out.println(file4==file2);




    }
}
