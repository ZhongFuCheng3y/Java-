package Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;



/**
 * Created by asd on 2016/9/11.
 */
// ��Ϸֻ����5��,���и��ı��ļ�����.
/*
    ����:
        1:�������϶���
        2:���ļ������ݼ��ص�������
        3:��ȡ�ļ���value
        4:��valueֵת����int���͵�
        5:�ж�valueֵ.
        6:�������һ����Ϸ,�Ͱ���������д���ļ���

 */
public class GameTest {
    public static void main(String[] args) throws IOException {


        //�������϶���
        Properties properties = new Properties();

        //���ļ������ݼ��ص�������
        properties.load(new FileReader("count.txt"));

        //���ݼ���ȡֵ
        String value = properties.getProperty("count");

        //��ֵת����int���͵�
        int number = Integer.parseInt(value);
        while (true) {
            if (number > 1) {
                System.out.println("�㲻������,��Ǯ��");
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
