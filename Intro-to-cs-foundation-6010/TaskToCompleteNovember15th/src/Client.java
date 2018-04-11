import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
 
public class Client
{
 private static Socket s1;
 public static void main(String args[])
    {
        try
        {
            String host = "localhost";
            int port = 3838;
            InetAddress address = InetAddress.getByName(host);
            s1= new Socket(address, port);
 
            // Send messages to server.
            OutputStream OS = s1.getOutputStream();
            OutputStreamWriter OSW = new OutputStreamWriter(OS);
            BufferedWriter BW = new BufferedWriter(OSW);
 
            String Message = "i am a really good student.";
 
            String sendMessage = Message + "\n";
            BW.write(sendMessage);
            BW.flush();
            System.out.println("Message sent to the server : "+sendMessage);
 
            //Get the return message from the server
            InputStream IS = s1.getInputStream();
            InputStreamReader ISR = new InputStreamReader(IS);
            BufferedReader br = new BufferedReader(ISR);
            String returnMessage = br.readLine();
            System.out.println("Message received from the server : " + returnMessage);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        finally
        {
            //Closing s1
            try
            {
                s1.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}