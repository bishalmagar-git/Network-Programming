//Add program to compare two IP addresses for equality and reachability

package InetAddress;

import java.net.InetAddress;

public class CompareIPs {
    public static void main(String[] args) throws Exception {
        InetAddress ip1 = InetAddress.getByName("8.8.8.8");
        InetAddress ip2 = InetAddress.getByName("8.8.8.8");
        System.out.println("IPs are equal: " + ip1.equals(ip2));
    }
}
