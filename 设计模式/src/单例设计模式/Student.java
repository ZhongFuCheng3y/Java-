package �������ģʽ;

/**
 * Created by asd on 2016/9/28.
 */
/*
    ����:
        1:�����캯��˽��
        2:�ڳ�Ա�����Լ�����һ������
        3:ͨ�����з�������
 */
/*
    ����ʽ:
        ֱ���ڳ�Ա�����д�������
        �ṩһ�����з������ض���
 */
public class Student {
    private Student(){}

    private static Student s = new Student();

    public static Student getStudent() {
        return s;
    }
}
