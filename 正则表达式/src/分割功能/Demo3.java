package �ָ��;

import java.util.Arrays;

/**
 * Created by asd on 2016/10/19.
 */
/*
  ��������һ���ַ���:"91 27 46 38 50"
    ��д����ʵ�������������ǣ�"27 38 46 50 91"

          ������
          		A:����һ���ַ���
          		B:���ַ������зָ�õ�һ���ַ�������
          		C:���ַ�������任��int����
          		    a:�Ȼ�ȡ�ַ�������ĳ���
                    b:�����ַ�������,��ÿ��Ԫ��ת�����int����,���뵽int������
          		D:��int��������
          		    a:ʹ��Arrays������
          		E:��������int��������װ��һ���ַ���
          		    a:�õ�StringBuilder
          		F:����ַ���

*/
public class Demo3 {
    public static void main(String[] args) {
        //�����ַ���
        String s = "91 27 46 38 50";

        //���ַ������зָ�,�õ��ַ�������
        String[] strings = s.split(" ");

        //���ַ�������ת����int����

        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }

        //��int�����������
        Arrays.sort(ints);

        //��������int��������װ��һ���ַ���
        StringBuilder stringBuilder = new StringBuilder();

        //����int����,�������Ԫ����ӵ�StringBuilder��
        for (int i = 0; i < ints.length; i++) {
            stringBuilder.append(ints[i]).append(" ");
        }

        //��StringBuilderת�����ַ���
        String s2 = stringBuilder.toString();
        System.out.println(s2);



    }
}
