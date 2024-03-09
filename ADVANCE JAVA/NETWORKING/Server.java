import java.io.*;
import java.net.*;
class Server 
{
	public static void main(String[] args)  throws Exception
	{
		ServerSocket listener = new ServerSocket(4000);
		System.out.println("System is ready to listen");
		Socket ssoc = listener.accept();
		InputStream is = ssoc.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		String msg = dis.readUTF();
		System.out.println(msg);
		System.out.println("Server is executed fully");
	}
}
