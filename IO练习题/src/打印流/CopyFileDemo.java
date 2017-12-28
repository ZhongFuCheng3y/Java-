package 打印流;

import java.io.*;

/**
 * Created by asd on 2016/9/11.
 */
/*
    需求:
        将o.txt复制成本zxc.txt在本目录下
    分析:
        1:封装数据源
        2:封装目的地
        3:读写数据
        4:关闭资源

 */
        public class CopyFileDemo {
            public static void main(String[] args) throws IOException {
                //封装数据源
                BufferedReader br = new BufferedReader(new FileReader("o.txt"));

                //封装目的地
                PrintWriter pw = new PrintWriter(new FileWriter("zxc.txt"),true);

                //一次读取一行数据
                String line = null;
                while ((line = br.readLine()) != null) {
                    pw.println(line);
                }

                //关闭资源
                pw.close();
                br.close();

            }

}
