import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class clientInteraction //extends serverTest
{
	public static void main(String[]args)
	{
		String hostName = args[0];
		int portNumber = Integer.parseInt(args[1]);
		
		try 
		{
			Socket echoSocket = new Socket(hostName, portNumber);
		    PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
		    BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
		    BufferedReader stdIn =new BufferedReader(new InputStreamReader(System.in));
		    echoSocket.close();
		    out.close();
		    in.close();
		    stdIn.close();
		}
		catch (java.io.IOException e)
		{
			
		}
	}
}