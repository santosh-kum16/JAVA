class Demo1
{
	public void disp()
	{
		System.out.println("Demo1");
	}
}
class Demo2 extends Demo1
{
	void disp()
	{
		System.out.println("Demo2");
	}
}
class LaunchMethodOverridingRule1
{
	public static void main(String args[])
	{
		Demo2 d = new Demo2();
		d.disp();
	}
}			//ERROR [O/P]:-attempting to assign weaker access privileges; was public
