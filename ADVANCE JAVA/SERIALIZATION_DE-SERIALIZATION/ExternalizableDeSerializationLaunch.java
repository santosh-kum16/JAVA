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
	public Cricketer()
	{

	}
	public void readExternal(ObjectInput oi )throws IOException,ClassNotFoundException
	{
		runs=oi.readInt();
		avg=oi.readFloat();
	}
	public void writeExternal(ObjectOutput oo)throws IOException
	{
		oo.writeInt(runs);
		oo.writeFloat(avg);
	}
}

class ExternalizableDeSerializationLaunch
{
	public static void main(String[] args)throws Exception
	{
		String path="D://JavaProgram//Advance java//ioprg//ecricketer.txt";
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Cricketer c = (Cricketer)ois.readObject();
		c.disp();
	}
}
