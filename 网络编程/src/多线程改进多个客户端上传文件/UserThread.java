package ���̸߳Ľ�����ͻ����ϴ��ļ�;

import java.io.*;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/23.
 */
/*
    �����ǿ��Լ�ʵ��һ��whileѭ����ס������Ҫִ�е����ݣ�������������
    ��Ϊ���ǰ�˳��ִ�У����ĳ���ļ��ܴ��ϴ��ٶȺܵͣ����ǲ�����һֱ��������
    ʵ������Ǹ��ݴ���ȸ������������ģ���������Ҫʹ�ö��߳����Ľ���
 */
public class UserThread implements Runnable {
    //��Ϊÿ���ͻ��˶��Ƕ����ģ���������Ҫ�ֿ���
    private Socket s;

    public UserThread(Socket s) {
        this.s = s;
    }


    @Override
    public void run() {
        try {
            // ��װͨ���ڵ���
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    s.getInputStream()));
            // ��װ�ı��ļ�
            // BufferedWriter bw = new BufferedWriter(new
            // FileWriter("Copy.java"));

            // Ϊ�˷�ֹ���Ƴ�ͻ
            String newName = System.currentTimeMillis() + ".java";
            BufferedWriter bw = new BufferedWriter(new FileWriter(newName));

            String line = null;
            while ((line = br.readLine()) != null) { // ����
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            // ��������
            BufferedWriter bwServer = new BufferedWriter(
                    new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("�ļ��ϴ��ɹ�");
            bwServer.newLine();
            bwServer.flush();

            // �ͷ���Դ
            bw.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
