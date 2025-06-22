//Server-side program that accepts a connection, reads a message sent by a client, and responds with a confirmation message.

package Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

@SuppressWarnings("ALL")
public class SimpleServer {
    public static void main(String[] args) {
        int port = 8080;

        try(ServerSocket serverSocket = new ServerSocket(port)){

            System.out.println("Server is listening on the port:"+port);

            while (true){
                //Accept client connection
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected:"+clientSocket.getInetAddress());

                //InputStream to read message from the client
                DataInputStream dataInputStream = new DataInputStream(clientSocket.getInputStream());
                String message = dataInputStream.readUTF();
                System.out.println("Received form client:"+message);

                //OutputStream to send confirmation to the client
                DataOutputStream dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
                dataOutputStream.writeUTF("Message received: "+message);

                clientSocket.close();
            }

        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
