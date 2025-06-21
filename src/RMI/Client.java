package RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            // Connect to the registry on localhost
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Lookup the service
            MessageService service = (MessageService) registry.lookup("MessageService");

            Scanner scanner = new Scanner(System.in);
            String input;

            while (true) {
                System.out.print("Client: ");
                input = scanner.nextLine();

                if (input.equalsIgnoreCase("exit")) break;

                String response = service.sendMessage(input);
                System.out.println("Server: " + response);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

