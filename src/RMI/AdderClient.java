package RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AdderClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Adder stub = (Adder) registry.lookup("AdderService");

            int result = stub.add(5, 10);
            System.out.println("Sum = " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
