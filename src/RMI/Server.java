package RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            MessageService service = new MessageServiceImpl();

            // Create RMI registry on port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Bind the service to the name "MessageService"
            registry.rebind("MessageService", service);

            System.out.println("Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

