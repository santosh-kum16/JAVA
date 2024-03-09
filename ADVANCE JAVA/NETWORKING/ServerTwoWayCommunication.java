import java.util.*;
import java.io.*;
import java.net.*;

class Server2WayComm 
{
	public static void main(String[] args)throws Exception 
	{
		ServerSocket listener = new ServerSocket(4000);
		System.out.println("Srver is ready to listen");
		Socket ssoc = listener.accept();
		InputStream is = ssoc.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		OutputStream os = ssoc.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		String msg = dis.readUTF();
		System.out.println(msg);
		Scanner scan = new Scanner(System.in);
		String reply = scan.nextLine();
		dos.writeUTF(reply);
	}
}
