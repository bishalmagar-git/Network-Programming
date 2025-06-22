// Server Program: Read from Client and Write to Server Console

package Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReadFromClientServer {
    public static void main(String[] args) {
        int port = 5000;
        try{
            try (ServerSocket serverSocket = new ServerSocket(port)) {
                System.out.println("Server started on port" + port);

                while (true) {
                    Socket clientSocket = serverSocket.accept();
                    System.out.println("New client connected: " + clientSocket.getInetAddress().getHostAddress());
                    DataInputStream dataInputStream = new DataInputStream(clientSocket.getInputStream());
                    String message = dataInputStream.readUTF();

                    System.out.println("Message received from client: " + message);
                    DataOutputStream dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
                    dataOutputStream.writeUTF("Message received: " + message);
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
