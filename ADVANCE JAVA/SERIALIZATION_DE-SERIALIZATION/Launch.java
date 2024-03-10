class Cricketer 
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
class Launch
{
	public static void main(String args[])
	{
		Cricketer c = new Cricketer("Sachin",10000,42.5f);
		c.disp();
	}
}
