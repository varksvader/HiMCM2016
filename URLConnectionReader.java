import java.net.*;
import java.io.*;

public class URLConnectionReader 
{
    public static void main(String[] args) throws Exception 
    {
        URL connect = new URL("http://www.ups.com/maps/");
        URLConnection yc = connect.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
        {
            System.out.println(inputLine);
        }
        in.close();
    }
}