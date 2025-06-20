package URLs_and_URIs;

import java.io.*;
import java.net.*;

public class WebPageDownloader {
    public static void main(String[] args) {
        String urlStr = "https://drive.google.com/file/d/1xnt0J8vH1WrW3IaqJyWpTq6s6Yjpfah9/view";  // Replace with your desired URL
        String outputFile = "downloaded.html";

        try {
            URL url = new URL(urlStr);
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream())
            );

            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(outputFile)
            );

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("Web page downloaded successfully as " + outputFile);

        } catch (IOException e) {
            System.out.println("Error downloading web page: " + e.getMessage());
        }
    }
}

