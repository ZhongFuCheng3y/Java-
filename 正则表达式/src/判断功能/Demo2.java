package �жϹ���;

import java.util.Scanner;

/**
 * Created by asd on 2016/10/19.
 */
/*
    ����:
        У������
    ����:
        1:����¼������
        2:�����������
            1517806580@qq.com
 			liuyi@163.com
  			linqingxia@126.com
  			fengqingyang@sina.com.cn
  			fqy@itcast.cn
  	    3:���ù���,�ж�
 	* 	4:������
 	*
 */
public class Demo2 {
    public static void main(String[] args) {

        //����¼������
        Scanner scanner = new Scanner(System.in);
        System.out.println("�����������:");
        String email = scanner.nextLine();

        //�����������
        String regex = "\\w+@\\w{2,6}(\\.\\w{2,3})+";

        //���ù���
        boolean flag = email.matches(regex);

        System.out.println("flag:" + flag);

    }
}
