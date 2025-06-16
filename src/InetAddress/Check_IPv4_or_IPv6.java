package InetAddress;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

public class Check_IPv4_or_IPv6 {
    public static void main(String[] args) throws Exception {
        InetAddress ip = InetAddress.getByName("2400:cb00:2048:1::c629:d7a2");
        if (ip instanceof Inet4Address) {
            System.out.println("IPv4 Address");
        } else if (ip instanceof Inet6Address) {
            System.out.println("IPv6 Address");
        }
    }
}
