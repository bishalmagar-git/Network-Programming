//Using CookieManager to Store & Retrieve Cookies

package HTTP;

import java.net.*;

public class CookieManagerExample {
    public static void main(String[] args) throws Exception {
        CookieManager manager = new CookieManager();
        CookieHandler.setDefault(manager);

        URL url = new URL("https://httpbin.org/cookies/set?session=abc123");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.getInputStream().close(); // Trigger the cookie set

        CookieStore store = manager.getCookieStore();
        System.out.println("Stored Cookies:");
        for (HttpCookie cookie : store.getCookies()) {
            System.out.println(cookie);
        }
    }
}
