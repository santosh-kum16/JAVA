import java.io.*;
class Demo 
{
	public static void main(String[] args) throws Exception 
	{
		String path1="D://ioprg//input.txt";
		String path2="D://ioprg//output.txt";

		FileInputStream Fis = new FileInputStream(path1);
		FileOutputStream Fos = new FileOutputStream(path2);
		int temp;
		while((temp=Fis.read())!=-1)
		{
			Fos.write(temp);
		}
	}
}
