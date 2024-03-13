import java.io.*;
class Cricketer implements Serializable
{
	transient String name;
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

class TransientSerializationLaunch
{
	public static void main(String[] args)throws Exception
	{
		Cricketer c = new Cricketer("Sachin",10000,25.2f);
		c.disp();
		String path="D://JavaProgram//Advance Java//ioprg//tcricketer.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c);
	}
}
