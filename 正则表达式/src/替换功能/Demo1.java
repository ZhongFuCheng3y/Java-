package �滻����;

/**
 * Created by asd on 2016/10/19.
 */
/*
    �滻����:
        String���public String replaceAll(String regex, String replacement)
        ʹ�ø�����replacement�滻���ַ�������ƥ�������������ʽ�����ַ���
 */
public class Demo1 {
    public static void main(String[] args) {
        //����һ���ַ���
        String s = "helloqq12345worldkh622112345678java";

        //������ȫ���ɵ�
        String regex = "\\d";
        String ss = " ";

        String result = s.replaceAll(regex, ss);
        System.out.println(result);

    }
}
