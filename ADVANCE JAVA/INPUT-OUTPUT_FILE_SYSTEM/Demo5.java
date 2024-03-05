import java.io.*;
class Launch6 
{
	public static void main(String[] args) 
	{
		String path = "D://JavaProgram//Advance Java//ioprg//input.txt";
		File f = new File(path);

			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println(f.getParent());
			System.out.println(f.getAbsolutePath());
	}
}
