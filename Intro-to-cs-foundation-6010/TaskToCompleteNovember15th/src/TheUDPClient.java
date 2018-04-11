import java.io.*;
import java.net.*;

class UDPClient
{
   public static void main(String args[]) throws Exception
   {
      BufferedReader Reader =  new BufferedReader(new InputStreamReader(System.in));
      
      DatagramSocket s3 = new DatagramSocket();
      
      InetAddress IPAddress = InetAddress.getByName("host");
      
      byte[] sendData = new byte[900];
      
      byte[] receiveData = new byte[900];
      
      String sentence = Reader.readLine();
      sendData = sentence.getBytes();
      
      DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
      s3.send(sendPacket);
      
      DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
      s3.receive(receivePacket);
      
      String sentence = new String(receivePacket.getData());
      
      System.out.println("What the server sent:" + sentence);
     
      s3.close();
   }
}