import java.util.*;
import java.io.*;
import java.net.*;
class Client2WayComm 
{
	public static void main(String[] args)throws Exception 
	{
		Socket csoc = new Socket("localhost",4000);
		OutputStream os = csoc.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		InputStream is = csoc.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		Scanner scan = new Scanner(System.in);
		String msg = scan.nextLine();
		dos.writeUTF(msg);
		String reply = dis.readUTF();
		System.out.println(reply);
	}
}
