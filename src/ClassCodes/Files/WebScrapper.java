package ClassCodes;

import javax.xml.crypto.Data;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class WebScrapper {
    public static void main(String[] args) {
        //https://www.goggle.com/welcome.html?name=john&age=11
        //scheme-> https
        //domain name -> www.goggle.com
        //path -> welcome.html?name = john&age = 11tt
        try{
            String location = "https://www.google.com";
            URL url = new URL(location);
            InputStream inputStream = url.openStream();

            byte[] bytes = inputStream.readAllBytes();

            for (byte data : bytes) {
                System.out.print(Character.toString(data));
            }
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            e.printStackTrace();
        }

    }
    }