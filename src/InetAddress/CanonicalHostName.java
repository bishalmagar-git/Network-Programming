package InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CanonicalHostName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an IP address or domain name: ");
        String input = scanner.nextLine();

        try {
            InetAddress address = InetAddress.getByName(input);
            System.out.println("Canonical Hostname: " + address.getCanonicalHostName());
        } catch (UnknownHostException e) {
            System.out.println("Could not resolve hostname.");
            e.printStackTrace();
        }
    }
}

