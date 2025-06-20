//Accessing Password Protected Sites

package URLs_and_URIs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.net.URLConnection;

public class AccessPwdProtectedSites extends Authenticator {
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://www.example.com");
        URLConnection conn = url.openConnection();

        String userName = "Admin";
        String password = "123456";

        Authenticator.setDefault(new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(userName,password.toCharArray());
            }
        });

        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = br.readLine())!=null){
            response.append(inputLine);
        }
        br.close();

        System.out.println(response);
    }
}
