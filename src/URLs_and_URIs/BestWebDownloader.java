// Java Program to Download a Web Page by asking the user input for URL

package URLs_and_URIs;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class BestWebDownloader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the URL to download: ");
        String urlStr = scanner.nextLine();

        String outputFile = "downloaded_page.html";

        try {
            URL url = new URL(urlStr);

            // Read the page content
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream())
            );

            // Save to a file
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

        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading from the URL: " + e.getMessage());
        }
    }
}
