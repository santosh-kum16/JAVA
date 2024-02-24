class Demo
{
	static int a,b,c;
	int x,y,z;

	static
	{
		System.out.println("Initialization started: static BLOCK");
		System.out.println(Demo.a+" static variable");

		a=10;
		b=20;
		c=30;
		System.out.println("Initialization completed: static BLOCK\n");

	}

	{
		System.out.println("Initialization started: non-static BLOCK");
		x=9;
		y=99;
		z=999;
		System.out.println("Initialization completed: non-static BLOCK\n");

	}

	static void disp1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("Inside static method\n");

	}

	void disp2()
	{
		System.out.println("Inside non static method : started");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("Inside non static method : completed\n");

	}
	Demo()
	{
		System.out.println("Default Constructor\n");
	}
}

class LaunchDemo
{
	public static void main(String args[])
	{
		System.out.println(Demo.a+" static variable");
		Demo.disp1();
		Demo d=new Demo();
		d.disp2();
	}
}
