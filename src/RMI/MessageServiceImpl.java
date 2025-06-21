package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MessageServiceImpl extends UnicastRemoteObject implements MessageService {

    protected MessageServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String sendMessage(String message) throws RemoteException {
        System.out.println("Client says: " + message);
        return "Server received: " + message;
    }
}

