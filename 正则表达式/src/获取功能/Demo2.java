package ��ȡ����;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by asd on 2016/10/19.
 */
/*
  ��ȡ���ܣ�
          ��ȡ��������ַ������������ַ���ɵĵ���
          da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?
*/
/*
    ����:
        1:��������ʽ�����ģʽ����
        2:ͨ��ģʽ�����ȡƥ����,����Ĳ�����Ҫƥ����ַ���
        3:����ƥ�����ķ���
 */
public class Demo2 {
    public static void main(String[] args) {

        //��������ʽ�����ģʽ����
        Pattern pattern = Pattern.compile("\\b\\w{3}\\b");

        //ͨ��ģʽ�����ȡƥ��������
        Matcher matcher = pattern.matcher("da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?");

        //����ƥ�����ķ���
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }

}
