package ��ȡ����;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by asd on 2016/10/19.
 */
/*
    ��ȡ����:
        Pattern ��Matcher���ʹ��

    Pattern:
        ָ��Ϊ�ַ�����������ʽ�������ȱ�����Ϊ�����ʵ��
        �ɽ��õ���ģʽ���ڴ��� Matcher ��������������ʽ���ö�������������ַ�����ƥ��
        ִ��ƥ�����漰������״̬��פ����ƥ�����У����Զ��ƥ�������Թ���ͬһģʽ��

    Matcher:
        ͨ������ Pattern �� character sequence ִ��ƥ����������档

        ͨ������ģʽ�� matcher ������ģʽ����ƥ����������ƥ�����󣬿���ʹ����ִ�����ֲ�ͬ��ƥ�������

            matches �������Խ����������������ģʽƥ�䡣

            lookingAt ���Խ��������д�ͷ��ʼ���ģʽƥ�䡣

            find ����ɨ�����������Բ������ģʽƥ�����һ�������С�



    ģʽ��ƥ�����Ļ���ʹ��˳��:
        1:��������ʽ�����ģʽ����
            Pattern p = Pattern.compile("a*b");
        2:ͨ��ģʽ�����ȡƥ��������,���ʱ����Ĳ����Ǳ�ƥ����ַ���
            Matcher m = p.matcher("aaaaab");
        3:����ƥ��������Ĺ���
            boolean b = m.matches();

    ���ֻƥ��һ��,���Ծ�ֱ��ʹ���ַ�������ʽ��ƥ��
        String s = "aaaaab";
		String regex = "a*b";
		boolean bb = s.matches(regex);
		System.out.println(bb);

 */
public class Demo1 {

    public static void main(String[] args) {
        //��������ʽ�����ģʽ����
        Pattern pattern = Pattern.compile("a*b");

        //ͨ��ģʽ�����ȡƥ��������,���ʱ����Ĳ����Ǳ�ƥ����ַ���
        Matcher matcher = pattern.matcher("aaaab");

        //����ƥ��������Ĺ���
        boolean b = matcher.matches();

        System.out.println(b);
    }


}
