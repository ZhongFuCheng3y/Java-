package ����Map����;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by asd on 2016/9/17.
 */
/*
    ��ʽ2:
        1:�������϶���
        2:����Ԫ�ز���ӵ�������
        3:��ȡ��ֵ�Զ���
        4:������ֵ�Զ���
        4:���ݼ�ֵ�Զ���ֱ��ȡ����ֵ
 */
public class MapDemo2 {
    public static void main(String[] args) {
        //�������϶���
        Map<String, String> map = new HashMap<>();

        //����Ԫ�ز���ӵ�������
        map.put("���", "С��Ů");
        map.put("����", "����");
        map.put("�", "�����");
        map.put("������", "÷����");

        //��ȡ��ֵ�Զ���
        Set<Map.Entry<String, String>> set = map.entrySet();

        //������ֵ�Զ���,���ݼ�ֵ�Զ���ֱ��ȡ����ֵ
        for (Map.Entry<String, String> entry : set) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:" + key + "value:" + value);

        }
    }
}
