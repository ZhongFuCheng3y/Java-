package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Created by asd on 2016/9/17.
 */
/*
    LinkedHashMap:
        1:��Map�ӿڵĹ�ϣ�������ʵ��,���п�Ԥ֪�ĵ���˳��
        2:��ϣ��֤����Ψһ��
        3:����֤����(�洢��ȡ����ѭ��һ��)

 */

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        //�������϶���
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        //���������Ԫ��
        map.put("2345", "hello");
        map.put("1234", "world");
        map.put("3456", "java");
        map.put("1234", "javaee");
        map.put("3456", "android");

        //����
        Set<String> set = map.keySet();
        for (String s : set) {
            String value = map.get(s);
            System.out.println(s + "---" + value);
        }
    }
}
