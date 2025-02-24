package InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalMachineInfo {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host Name: " + localHost.getHostName());
            System.out.println("Local IP Address: " + localHost.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Could not find local machine address.");
            e.printStackTrace();
        }
    }
}

