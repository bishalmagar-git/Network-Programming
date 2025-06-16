//Add program to check if an email sender's IP is on a spam blacklist

package InetAddress;

import java.net.InetAddress;

public class SpamChecker {
    public static void main(String[] args) throws Exception {
        InetAddress ip = InetAddress.getByName("192.168.1.10");
        String ipStr = ip.getHostAddress();
        if (ipStr.startsWith("192.168") || ipStr.startsWith("10.")) {
            System.out.println("Possible spam or internal IP");
        } else {
            System.out.println("Public IP");
        }
    }
}
