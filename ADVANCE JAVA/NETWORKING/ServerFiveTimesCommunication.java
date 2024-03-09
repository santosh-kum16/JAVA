import java.util.*;
import java.io.*;
import java.net.*;

class Server5timesComm 
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
		Scanner scan = new Scanner(System.in);
		for (int i=0;i<5 ;i++ )
		{
			String msg = dis.readUTF();
			System.out.println(msg);
			String reply = scan.nextLine();
			dos.writeUTF(reply);
		}
		
	}
}
