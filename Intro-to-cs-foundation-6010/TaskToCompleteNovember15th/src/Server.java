import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server 
{
	private static Socket s1;
	
	public static void main(String args[]) 
	{
		try 
		{
		
			int port =3838;
			//register service on port 3838
			ServerSocket s = new ServerSocket(port);
			System.out.println("Server Started to listening to the port 3838.");
			//wait and accept a connection
			while(true)
			{
				Socket  s1 = s.accept();
				//get a communication stream associated with the socket
				InputStream IN = s1.getInputStream();
				InputStreamReader ISR = new InputStreamReader(IN);
				BufferedReader BR = new BufferedReader(ISR);
				String Message = BR.readLine();
				System.out.println("Message received from client is "+Message);

				//return the value in lowcase
				String returnMessage;
				try 
				{

					StringBuffer SB = new StringBuffer();
					if(Message!=null) 
					{
						for(int i=0;i<Message.length();i++)
						{
							char c = Message.charAt(i);
							if(Character.isUpperCase(c)){
								SB.append(Character.toLowerCase(c));
							}
						}
						}
					returnMessage = SB.toString();
				}
			catch(NumberFormatException e)
				{
				//If Message was not a string.Sending back the respond to client.
				returnMessage = "please send me a proper message.\n"; 
			}
				//Sending the response back to the client.
				OutputStream OS = s1.getOutputStream();
				OutputStreamWriter OSW =new OutputStreamWriter(OS);
				BufferedWriter BW = new BufferedWriter(OSW);
				BW.write(returnMessage);
				System.out.println("Sending" + returnMessage +"to client.");
				BW.flush();
				s.close();
			}}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		//Close the connection, but not the server socket
		finally 
		{
			try
			{
				s1.close();
				
			}
			catch(Exception e) {}
		}
		}
	}