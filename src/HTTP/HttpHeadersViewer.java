// Java Program to Obtain HTTP Headers

package HTTP;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class HttpHeadersViewer {
    public static void main(String[] args) {
        try {
            // You can change this URL to test other websites
            URL url = new URL("https://httpbin.org/get");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Get all header fields
            Map<String, List<String>> headers = conn.getHeaderFields();

            System.out.println("🔎 HTTP Headers for: " + url + "\n");

            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                String headerName = entry.getKey();
                List<String> headerValues = entry.getValue();

                if (headerName != null) {
                    System.out.println(headerName + ": " + String.join(", ", headerValues));
                } else {
                    // This is the HTTP status line (e.g., HTTP/1.1 200 OK)
                    System.out.println("Status Line: " + String.join(", ", headerValues));
                }
            }

            conn.disconnect();

        } catch (IOException e) {
            System.out.println("❌ Error fetching headers: " + e.getMessage());
        }
    }
}
