package StringBuffer��ϰ;

/**
 * Created by asd on 2016/9/19.
 */
/*
    Ϊʲô������Ҫ�õ���֮���ת��?
        1:���ǰ�AתΪB,��ʵ����Ϊ����B����
        2:���ǰ�BתΪA,����Ҫ����A����,����Ҫת����

    String��StringBuffer���໥ת��
         String  - StringBuffer
            1:StringBuffer sb = new StringBuffer()
                sb.append(s)
            2:StringBuffer sb = new StringBuffer(s)
         StringBuffer - String
            1:sb.toString()
            2:String s = new String(sb);
 */
/*
    ����:
        ������ƴ�ӳ�һ���ַ���
    ����:
        1:���ǿ�����String��ƴ��
        2:����Ҳ������StringBuffer��ƴ��
            ��Ȼ,���ǻ�ʹ��StringBuffer
 */
public class StringBufferTest {
    public static void main(String[] args) {
        // ����һ������
        int[] arr = { 44, 33, 55, 11, 22 };
        String s = arrayToString(arr);
        System.out.println(s);
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else if (i < arr.length) {
                sb.append(arr[i] + ", ");
            }

        }
        sb.append("]");


        return sb.toString();
    }

}
