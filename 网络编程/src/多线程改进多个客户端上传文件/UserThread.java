package 多线程改进多个客户端上传文件;

import java.io.*;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/23.
 */
/*
    我们是可以简单实用一个while循环套住服务器要执行的内容，但是这样不好
    因为它是按顺序执行，如果某个文件很大，上传速度很低，我们不可能一直等着它。
    实际情况是根据带宽等各种因素来看的，所以我们要使用多线程来改进。
 */
public class UserThread implements Runnable {
    //因为每个客户端都是独立的，所以我们要分开来
    private Socket s;

    public UserThread(Socket s) {
        this.s = s;
    }


    @Override
    public void run() {
        try {
            // 封装通道内的流
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    s.getInputStream()));
            // 封装文本文件
            // BufferedWriter bw = new BufferedWriter(new
            // FileWriter("Copy.java"));

            // 为了防止名称冲突
            String newName = System.currentTimeMillis() + ".java";
            BufferedWriter bw = new BufferedWriter(new FileWriter(newName));

            String line = null;
            while ((line = br.readLine()) != null) { // 阻塞
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            // 给出反馈
            BufferedWriter bwServer = new BufferedWriter(
                    new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("文件上传成功");
            bwServer.newLine();
            bwServer.flush();

            // 释放资源
            bw.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
