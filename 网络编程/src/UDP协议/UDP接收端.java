package UDPЭ��;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by ozc on 2016/8/22.
 */
/*
    1������һ�����ն˵�Socket����
    2������һ�����ݰ������ܵ�������
    3������Socket����Ľ��շ�����������
    4���������ݱ�������ʾ�ڿ���̨
    5���ͷ���Դ
 */
public class UDP���ն� {
    public static void main(String[] args) throws IOException {
        //����Socket����
        //ָ���˶˿�
        DatagramSocket ds = new DatagramSocket(10086);

        //����һ�����ݰ��������������ݰ���
        //  DatagramPacket(byte[] buf , int length);
        byte[] bys = new byte[1024];
        int length = bys.length;
        DatagramPacket dp = new DatagramPacket(bys,length);

        //����socket����Ľ��շ�������������
        ds.receive(dp);//�˷������������

        //�������ݰ�������ʾ�ڿ���̨��
        //��ȡ�Է���ip
        InetAddress address = dp.getAddress();
        String ip = address.getHostAddress();

        //��ȡ���ݻ�����
        //��ȡ���ݵ�ʵ�ʳ���
        byte [] bys2 = dp.getData();
        int len = dp.getLength();

        String s = new String(bys2,0,len);
        System.out.println(ip+"���ݹ����������ǣ�" + s);

        //�ͷ���Դ
        ds.close();

    }
}
