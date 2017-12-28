package impl;

import dao.UserDao;
import pojo.User;

import java.io.*;

/**
 * Created by asd on 2016/9/12.
 */
/*
    IO��ʵ���û���¼ע��

    ����:
        1:
 */
public class UserDaoImpl implements UserDao {
    //Ϊ�˱�֤��һ����,�ļ����Ѿ�������
    private static File file = new File("user2.txt");

    static {
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("�����ļ�ʧ����!!");
        }
    }


    @Override
    public boolean isLogin(String username, String passworld) {
        //��Ǳ���
        boolean flag = false;

        //��ȡ����
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null) {
                //���ַ���
                String[] strings = line.split("=");
                if (strings[0].equals(username) && strings[1].equals(passworld)) {
                    flag = true;
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("ϵͳ�Ҳ����ļ�");
        } catch (IOException e) {
            System.out.println("�û���¼ʧ��");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("�û���½�ͷ���Դʧ��");

                }
            }
        }
        return flag;


    }

    @Override
    public void regist(User user) {
        //��ע���������һ���Ĺ���,�Ҿ��Լ��������: �û��� = ����

        //д������
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(user.getUsername() + "=" + user.getPassworld());
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            System.out.println("�û�ע��ʧ����");
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("�û�ע���ͷ���Դʧ��");
                }
            }
        }


    }
}
