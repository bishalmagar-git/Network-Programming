package InetAddress;

import java.net.InetAddress;

public class GET_All_IPs {
    public static void main(String[] args) throws Exception {
        InetAddress[] addresses = InetAddress.getAllByName("www.microsoft.com");
        for (InetAddress ip : addresses) {
            System.out.println("IP: " + ip.getHostAddress());
        }
    }
}
