package RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AdderServer {
    public static void main(String[] args) {
        try {
            Adder stub = new AdderImpl(); // create remote object
            Registry registry = LocateRegistry.createRegistry(1099); // start registry on port 1099
            registry.rebind("AdderService", stub); // bind object to name
            System.out.println("Adder RMI Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

