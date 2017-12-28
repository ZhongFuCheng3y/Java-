package InetAddressµÿ÷∑;

        import java.net.InetAddress;
        import java.net.UnknownHostException;

public class InetAddressDemo {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("192.168.1.106");

        String name = address.getHostName();
        String ip = address.getHostAddress();
        System.out.println(name + "----" + ip);

    }
}
