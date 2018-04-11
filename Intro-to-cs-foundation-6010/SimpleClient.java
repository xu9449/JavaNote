import  java.net.*; 
import  java.io.*; 

public class SimpleClient {

	public static void main(String[] args) throws IOException{
		// Open your connection to server at port 1254
		Socket s1 = new Socket("localhost", 1254);
		 // Get an input file handle from the socket and read the input
		 InputStream s1In = s1.getInputStream();
		 DataInputStream dis = new DataInputStream(s1In);
		 String st = new String (dis.readUTF());
		 System.out.println(st);

		// TODO Auto-generated method stub

	}

}
