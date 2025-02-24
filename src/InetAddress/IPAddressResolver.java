package InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPAddressResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a website address (e.g., google.com): ");
        String website = scanner.nextLine();

        try {
            InetAddress[] addresses = InetAddress.getAllByName(website);
            for (InetAddress address : addresses) {
                System.out.println("IP Address: " + address.getHostAddress());
            }
        } catch (UnknownHostException e) {
            System.out.println("Could not resolve IP addresses.");
            e.printStackTrace();
        }
    }
}

