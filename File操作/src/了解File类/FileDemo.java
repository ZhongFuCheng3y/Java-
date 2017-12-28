package �˽�File��;

import java.io.File;

/**
 * Created by asd on 2016/9/6.
 */
/*
    ����IOǰ��:
        1:�˽��쳣
        2:֪��Ӳ�����ļ��ı�����ʽ---File��
    File:
        �ļ���Ŀ¼(�ļ���)·�����ĳ����ʾ��ʽ

    ���췽��:
        1:File(String pathname):����һ��·���õ�File����
        2:File(String parent, String child):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
        3:File(File parent, String child):����һ����File�����һ�����ļ�/Ŀ¼�õ�File����
 */
public class FileDemo {

    public static void main(String[] args) {

        //����һ��·���õ�File����---��·����װ��һ��File����
        File file = new File("E:\\java����\\day19\\code");

        //����һ��Ŀ¼,��һ�����ļ�/Ŀ¼�õ�File����
        File file2 = new File("E:\\java����\\day19", "code");

        //����һ����File�����һ�����ļ�/Ŀ¼�õ�File����
        File file3 = new File("E:\\java����\\day19");
        File file4 = new File(file3 , "code");

        //new�����Ķ���϶��ǲ�һ����.
        System.out.println(file==file2);
        System.out.println(file4==file2);




    }
}
