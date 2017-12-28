package TCP客户端键盘录入;

import java.io.*;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/22.
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.106", 22222);

        //键盘录入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //把通道的流包装一下
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line = null;
        while((line = br.readLine()) != null) {
            if("886".equals(line)) {
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        //bw.close();
        //br.close();
        s.close();//上面两个不用手动关闭，因为关闭了socket对象就相当于关闭了两个流对象了。

    }
}
