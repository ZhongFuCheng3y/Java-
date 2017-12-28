package 重命名功能练习;

import java.io.File;

/**
 * Created by asd on 2016/9/6.
 */
/*
    需求:
        把E:\java刘意文件夹下的文件夹改名为day_01
    步骤:
        1:封装目录
        2:获取目录下所有文件的File数组
        3:遍历File数组,得到每一个File对象
        4:拼接一个新的名称,然后重命名
 */
public class FileDemo {

    public static void main(String[] args) {

        //封装目录
        File file = new File("E:\\java郝斌");

        //获取目录下File数组
        File[] fileArray = file.listFiles();

        //遍历File数组,得到每一个File对象
        for(File f : fileArray) {

            //获取File的名称
            String name = f.getName();

            //获取"0"的位置
            int index = name.indexOf("0");
            String newName1 = name.substring(index+1);
            System.out.println(newName1);

            File newFile = new File(file,newName1);

            //重命名
            //调用者是目录下每个File对象
            f.renameTo(newFile);


        }
    }
}
