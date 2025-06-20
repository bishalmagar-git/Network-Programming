package URLs_and_URIs;

import javax.swing.*;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class DemoAuth extends Authenticator {
    protected PasswordAuthentication getPasswordAuthentication(){
        String userName = JOptionPane.showInputDialog("User Name:");
        String password = new String(JOptionPane.showInputDialog("Password:").toCharArray());
        return new PasswordAuthentication(userName,password.toCharArray());
    }

    public static void main(String[] args) {
        DemoAuth demoAuth = new DemoAuth();
        PasswordAuthentication pa  = demoAuth.getPasswordAuthentication();
        System.out.println(pa.getUserName());
//        System.out.println(pa.getPassword());

    }
}
