import java.io.*;
class Launch1
{
	public static void main(String[] args) throws Exception 
	{
		String path1="D://ioprg//input.txt";
		String path2="D://ioprg//output.txt";

		FileReader fr = new FileReader(path1);
		FileWriter fw = new FileWriter(path2);
		int temp;
		while((temp=fr.read())!=-1)
		{
			fw.write(temp);
		}
		fw.flush();
	}
}
