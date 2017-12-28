package ���÷����ȡ������Ϣ;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by ozc on 2016/8/30.
 */
/*
    1��������ͨ���͵ĳ�Ա���������ǿ���ֱ��ʹ��getType()��ȡ������
        2�����ڴ����͵ĳ�Ա��������Ҫ��ȡ�䷺�����;��е㲻һ����
            a������Field�����ȡ��Ա�����ķ�������
            b���Ըñ���ǿ��ת����Parameterized����
            c��ʹ��getActualTypeArguments()��ȡ������Ϣ
            d��ʹ��getRawType()��ȡԭʼ������Ϣ
 */
public class GenericTest {

    //����һ��Map����
    private Map<String,Integer> score;

    public static void main(String[] args) throws NoSuchFieldException {

        //��ȡGenericTest��class����
        Class<GenericTest> clazz = GenericTest.class;

        //��ȡField����
        Field f = clazz.getDeclaredField("score");

        //ֱ��ʹ��getType()ȡ��������ֻ����ͨ���͵ĳ�Ա������Ч
        Class<?> a = f.getType();
        System.out.println("score is :"+ a);

        //��ȡ��Ա����f�ķ�������
        Type gType = f.getGenericType();

        //�ж�gType������ParameterizedType����
        if(gType instanceof ParameterizedType) {

            //ǿ��ת����ParameterizedType����
            ParameterizedType pType  = (ParameterizedType)gType;

            //��ȡԭʼ����
            Type rType = pType.getRawType();
            System.out.println("ԭʼ������" + rType);

            //��ȡ�������͵ķ��Ͳ���
            Type[] tArgs = pType.getActualTypeArguments();
            System.out.println("������Ϣ�ǣ�");
            for(int i=0; i<tArgs.length; i++) {
                System.out.println("��" + i + "��������Ϣ�ǣ�" + tArgs[i]);

            }

        }
        else{
            System.out.println("����������");
        }


    }

}
