package ����Map����;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by asd on 2016/9/17.
 */
/*
    Map���������ַ�ʽ
        1:��ȡ�������еļ�,���ݼ���ȡֵ
        2:��ȡ���ϵļ�ֵ�Զ���,�ֱ��ȡ����ֵ

    ��ʽ1:
        1:����Map���϶���
        2:����Ԫ�ز���ӵ�������
        3:��ȡ���������еļ�
        4:���������еļ�,���ݼ���ȡֵ.
 */
public class MapDemo1 {
    public static void main(String[] args) {
        //����Map���϶���
        Map<String, String> map = new HashMap<>();

        //����Ԫ�ز���ӵ�������
        map.put("���", "С��Ů");
        map.put("����", "����");
        map.put("�", "�����");
        map.put("������", "÷����");

        //��ȡ���������еļ�
        Set<String> set = map.keySet();

        //�������еļ�,���ݼ���ȡֵ
        for (String s : set) {
            String value = map.get(s);
            System.out.println("key:" + s + "::" + "value:" + value);
        }


    }
}
