//Java program to send an HTTP POST request and prints the server's response.

package HTTP;

import java.io.*;
import java.net.*;

public class HttpPostExample {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://httpbin.org/post");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

        String data = "username=admin&password=1234";
        try (OutputStream os = conn.getOutputStream()) {
            os.write(data.getBytes());
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = in.readLine()) != null)
            System.out.println(line);
        in.close();
    }
}
