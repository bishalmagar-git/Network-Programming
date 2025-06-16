package InetAddress;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;

public class LogFileReader {
    public static void main(String[] args) {
        String filePath = "C://Sixth/JavaInetAddressPrograms/log.txt"; // Update path if needed

        Set<String> uniqueIPs = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue; // skip empty lines

                String[] tokens = line.split("\\s+"); // handle multiple spaces/tabs
                if (tokens.length > 0) {
                    String ip = tokens[0];
                    uniqueIPs.add(ip);
                }
            }

            // Now resolve and print hostnames
            for (String ip : uniqueIPs) {
                try {
                    InetAddress addr = InetAddress.getByName(ip);
                    System.out.println("Access from: " + ip + " (" + addr.getHostName() + ")");
                } catch (UnknownHostException e) {
                    System.out.println("Could not resolve IP: " + ip);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading the log file: " + e.getMessage());
        }
    }
}
