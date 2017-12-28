package 获取功能1;

/**
 * Created by asd on 2016/9/6.
 */

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * public String getAbsolutePath():获取绝对路径
 * public String getPath():获取相对路径
 * public String getName():获取名称
 * public long length():获取长度,字节数
 * public long lastModified():获取最后一次修改时间,毫秒值
 */
public class FileDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        file.createNewFile();

        System.out.println("getAbsolutePath:" + file.getAbsolutePath());
        System.out.println("getPath:" + file.getPath());
        System.out.println("getName:" + file.getName());
        System.out.println("length:" + file.length());
        System.out.println("lastModified:" + file.lastModified());

        //1473163343991
        //格式化毫秒值
        Date d = new Date(1473163343991L);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);
    }
}
