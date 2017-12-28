package Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;



/**
 * Created by asd on 2016/9/11.
 */
// 游戏只能玩5次,我有个文本文件配置.
/*
    步骤:
        1:创建集合对象
        2:将文件的数据加载到集合中
        3:获取文件的value
        4:将value值转换成int类型的
        5:判断value值.
        6:如果玩了一次游戏,就把数据重新写在文件上

 */
public class GameTest {
    public static void main(String[] args) throws IOException {


        //创建集合对象
        Properties properties = new Properties();

        //将文件的数据加载到集合中
        properties.load(new FileReader("count.txt"));

        //根据键获取值
        String value = properties.getProperty("count");

        //将值转换成int类型的
        int number = Integer.parseInt(value);
        while (true) {
            if (number > 1) {
                System.out.println("你不能玩了,给钱吧");
                System.exit(0);
            } else {
                number++;
                NumberGame.start();
                properties.setProperty("count", String.valueOf(number));
                properties.store(new FileWriter("count.txt"), null);

            }
        }





    }
}
