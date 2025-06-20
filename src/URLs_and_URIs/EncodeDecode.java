package URLs_and_URIs;

import java.net.URLEncoder;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class EncodeDecode {
    public static void main(String[] args) {
        String originalData = "param1=value1&param2=value2";
        String encodedData;

        // Encoding data
        encodedData = URLEncoder.encode(originalData, StandardCharsets.UTF_8);
        System.out.println("Encoded data: " + encodedData);

        // Decoding data
        String decodedData = URLDecoder.decode(encodedData, StandardCharsets.UTF_8);
        System.out.println("Decoded data: " + decodedData);
    }
}