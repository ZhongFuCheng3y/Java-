package 查找某目录下是否存在某文件;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by asd on 2016/9/6.
 */
/*
    1:获取所有的,遍历,依次判断,满足条件就输出
    2:获取的时候已经是满足条件的,输出即可

    想要实现第2种方法,首先要学习一个接口:文件名称过滤器---FilenameFilter

    该接口有一个accept()方法------测试指定文件是否应该包含在某一文件列表中
    到底把不把文件或文件夹的名称加入到数组,取决于返回值是true还是false


    1:public String[] list(FilenameFilter filter)
    2:public File[] listFiles(FilenameFilter filter)
 */
public class FileDemo2 {
    public static void main(String[] args) {

        //首先封装e盘目录
        File file = new File("e:\\");

        //获取String数组
        String[] strArray = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                //dir - 被找到的文件所在的目录
                //name - 文件的名称
                //System.out.println(dir + "----" + name);

                //File file = new File(dir,name);
                //System.out.println(file);

                //到底把不把文件或文件夹的名称加入到数组,取决于返回值是true还是false
                return new File(dir, name).isFile() && name.endsWith(".txt");
            }
        });
        //遍历数组
        for(String s : strArray) {
            System.out.println(s);
        }
    }
}
