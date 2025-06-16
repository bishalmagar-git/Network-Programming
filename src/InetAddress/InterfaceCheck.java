//Add program to check if a specific network interface is up and supports multicast

package InetAddress;

import java.net.NetworkInterface;
import java.net.SocketException;

public class InterfaceCheck {
    public static void main(String[] args) {
        try {
            // You can use "eth0", "wlan0", "lo", etc., depending on the system
            String interfaceName = "lo"; // Loopback (works on most systems)
            NetworkInterface ni = NetworkInterface.getByName(interfaceName);

            if (ni != null) {
                System.out.println("Interface: " + interfaceName);
                System.out.println("Is Up: " + ni.isUp());
                System.out.println("Supports Multicast: " + ni.supportsMulticast());
                System.out.println("Display Name: " + ni.getDisplayName());
            } else {
                System.out.println("Interface not found: " + interfaceName);
            }
        } catch (SocketException e) {
            System.out.println("Error checking interface: " + e.getMessage());
        }
    }
}
