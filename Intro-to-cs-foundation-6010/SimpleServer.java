import java
import java.io.DataOutputStream;
import java.net.Socket;

import org.omg.CORBA.portable.OutputStream;

import java¡£io¡£*£» 

public class SimpleServer {
public static void main(String args[]) throws IOException//
//register service on port 1254
ServerSocket s = new ServerSocket(1254);
//wait and accept a connection
Socket s1=s.accept();
//get a communication stream associated with the socket
OutputStream s1out = s1.getOutputStream();
DataOutputStream dos =new DataOutputStream(s1out);
//Send a string
dos.writeUTF("Hi there");
//Close the connection, but not the server socket
dos.close();
s1out.close();
s1.close();}
}
