//Java program to scan ports.

package Socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class PortScanner {
    public static void main(String[] args) {
        String host = "localhost";

        for (int port = 1; port <= 2048; port++) {
            try (Socket socket = new Socket()) {
                socket.connect(new InetSocketAddress(host, port), 1000);
                System.out.println("Port " + port + " is open");
            } catch (IOException e) {
                // Do nothing for closed ports
            }
        }
    }
}
