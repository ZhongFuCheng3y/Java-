package 创建功能;

/**
 * Created by asd on 2016/9/6.
 */

import java.io.File;
import java.io.IOException;
/*
    创建功能:
        1:public boolean createNewFile():创建文件,如果有,就不创建了
        2:public boolean mkdir():创建文件夹,如果有,就不创建了
        3:public boolean mkdirs():创建文件夹,如果父文件夹不存在,就帮你创建出来
 */

/**
 * 要点:
 * 1:首先要获得路径下的File对象
 * 2:要想在某个目录下创建内容,首先该目录要存在
 * 3:用mkdirs创建出来的都是文件夹
 */
public class FileDemo {

    public static void main(String[] args) throws IOException {

        //需求:我要在e盘目录下创建一个文件夹demo
        File file = new File("e:\\demo");
        System.out.println("mkdir: " + file.mkdir());

        //需求:我要在e盘目录demo下创建一个文件a.txt
        File file2 = new File("e:\\demo\\a.txt");
        System.out.println("createNewFile: " + file2.createNewFile());

        //需求:在e盘目录test下创建一个文件b.txt
        //下面的代码是错的(IOException),因为要想在目录下创建内容,首先这个目录必须存在
        //File file3 = new File("e:\\test\\b.txt");
        //System.out.println("createNewFile:" + file3.createNewFile());

        //需求:在e盘目录test下创建aaa目录
        //下面的代码也是错的,因为test目录还没有存在
        // File file4= new File("e:\\test\\aaa");
        //System.out.println("mkdir:" + file4.mkdir());

        //需求:在e盘目录test下创建aaa目录
        File file5 = new File("e:\\test");
        File file6 = new File("e:\\test\\aaa");
        System.out.println("mkdir:" + file5.mkdir());
        System.out.println("mkdir:" + file6.mkdir());

        //其实我们有更简单的方法
        File file7 = new File("e:\\aaa\\bbb\\ccc\\ddd\\eee");
        System.out.println("mkdirs: " + file7.mkdirs());

        //即使a.txt后缀看起来是txt,但是mkdirs()创建的都是文件夹
        File file8 = new File("e:\\aaa\\a.txt");
        System.out.println("mkdirs:" + file8.mkdirs());



    }
}
