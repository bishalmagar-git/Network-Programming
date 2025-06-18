// Reusing Connection with Keep-Alive

package HTTP;

import java.io.*;
import java.net.*;

public class KeepAliveExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://httpbin.org/get");

        for (int i = 1; i <= 2; i++) {
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Connection", "keep-alive");

            System.out.println("Request #" + i);
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            while (in.readLine() != null) ; // Just reading
            in.close();

            System.out.println("Response code: " + conn.getResponseCode());
            conn.disconnect();
        }
    }
}
