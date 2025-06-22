//Java client program that connects to a server, sends a message, and prints the response from the server.

package Socket;

import java.io.*;
import java.net.*;

public class ClientSocketExample {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 8080;

        try (
                // Step 1: Connect to the server
                Socket socket = new Socket(host, port);

                // Step 2: Output stream to send message
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                // Step 3: Input stream to receive response
                DataInputStream in = new DataInputStream(socket.getInputStream())
        ) {
            // Step 4: Send message to server
            out.writeUTF("Hello Server!");

            // Step 5: Read server's response
            String response = in.readUTF();
            System.out.println("Server replied: " + response);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
