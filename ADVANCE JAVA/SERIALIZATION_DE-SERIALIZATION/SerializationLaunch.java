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

class SerializationLaunch
{
	public static void main(String[] args)throws Exception
	{
		Cricketer c = new Cricketer("MSD",1000,25.2f);
		c.disp();
		String path="D://JavaProgram//AdvanceJava//ioprg//cricketer.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c);
	}
}
