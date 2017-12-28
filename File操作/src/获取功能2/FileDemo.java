package 获取功能2;

/**
 * Created by asd on 2016/9/6.
 */

import java.io.File;

/**
 * public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
 * public File[] listFiles:获取指定目录下的所有文件或者文件夹的File数组
 */
public class FileDemo {

    public static void main(String[] args) {
        //指定一个目录
        File file = new File("e:\\");

        //获取名称
        String[] strArray = file.list();
        for(String s : strArray) {
            System.out.println(s);
        }
        System.out.println("---------------------------");
        //----------------------------

        //获取File数组
        File[] fileArray= file.listFiles();
        for(File f : fileArray) {
            System.out.println(f.getName());
        }
    }
}
