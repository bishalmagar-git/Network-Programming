//Add program to check reachability of a host using InetAddress

package InetAddress;

import java.net.InetAddress;

public class Reachability {
    public static void main(String[] args) throws Exception {
        InetAddress ip = InetAddress.getByName("www.mechicampus.edu.np");
        System.out.println("Is reachable: " + ip.isReachable(3000));
    }
}
