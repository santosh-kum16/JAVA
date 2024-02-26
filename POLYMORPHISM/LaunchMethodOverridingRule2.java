class Demo1
{
	 void disp()
	{
		System.out.println("Class Demo 1");
	}
}
class Demo2 extends Demo1
{
	int disp()
	{
		System.out.println("Class Demo 2");
		return 10;
	}
}
class LaunchMethodOverridingRule2
{
	public static void main(String args[])
	{
		Demo2 d = new Demo2();
		d.disp();
	}		
}			//ERROR[O/P]:-return type int is not compatible with void
