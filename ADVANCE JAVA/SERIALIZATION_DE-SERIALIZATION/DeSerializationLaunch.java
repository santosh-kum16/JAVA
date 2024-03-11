import java.io.*;
class Cricketer implements Serializable
{
	String name;
	int runs;
	float avg;
	Cricketer(String name,int runs,float avg)
	{
		this.name=name;
		this.runs=runs;
		this.avg=avg;
	}
	void disp()
	{
		System.out.println(name);
		System.out.println(runs);
		System.out.println(avg);
	}
}

class DeSerializationLaunch
{
	public static void main(String[] args)throws Exception
	{
		String path="D://JavaProgram//Advance java//ioprg//cricketer.txt";
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Cricketer c = (Cricketer)ois.readObject();
		c.disp();
	}
}
