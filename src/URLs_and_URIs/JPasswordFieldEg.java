// JPasswordField Example

package URLs_and_URIs;

import javax.swing.*;

public class JPasswordFieldEg {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PasswordField Example");

        // Create password field
        JPasswordField jPasswordField = new JPasswordField(10);
        jPasswordField.setEchoChar('*');

        // Create button
        JButton button = new JButton("Submit");

        // Action when button is clicked
        button.addActionListener(e -> {
            char[] passChars = jPasswordField.getPassword();
            String password = new String(passChars);
            System.out.println("Password: " + password);
        });

        // Create panel and add components
        JPanel panel = new JPanel();
        panel.add(new JLabel("Password:"));
        panel.add(jPasswordField);
        panel.add(button);

        // Set up frame
        frame.add(panel);
        frame.setSize(300, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
