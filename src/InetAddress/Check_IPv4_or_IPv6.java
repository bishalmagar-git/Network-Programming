package InetAddress;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Check_IPv4_or_IPv6 {
    public static void main(String[] args) throws Exception {

        try{
            InetAddress address = InetAddress.getByName("2400:cb00:2048:1::c629:d7a2");
            if (address instanceof Inet4Address) {
                System.out.println("IPv4 Address");
            } else if (address instanceof Inet6Address) {
                System.out.println("IPv6 Address");
            }
        }catch (UnknownHostException e){
            System.err.println("Cannot solve the host name");
            e.printStackTrace();
        }


    }
}
