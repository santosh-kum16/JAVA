import java.io.*;
class Launch5 
{
	public static void main(String[] args) 
	{
		String path = "D://AddressBook";
		File f = new File(path);
		if (f.exists())
		{
			if (f.isFile())
				System.out.println("Its a File");
			else
				System.out.println("Its a Folder");
		}
		else
			System.out.println("Invalid path");
	}
}
