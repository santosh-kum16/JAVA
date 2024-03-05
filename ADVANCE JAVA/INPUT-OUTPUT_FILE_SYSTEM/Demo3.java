import java.io.*;
class Demo3
{
	public static void main(String[] args) throws Exception 
	{
		String path1="D://JavaProgram//Advance Java//ioprg//input.txt";
		String path2="D://JavaProgram//Advance Java//ioprg//output.txt";

		FileReader fr = new FileReader(path1);
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter(path2);
		BufferedWriter bw = new BufferedWriter(fw);
		String temp;
		while((temp=br.readLine())!=null)
		{
			bw.write(temp);
			System.out.println(temp);
		}
		bw.flush();
	}
}
