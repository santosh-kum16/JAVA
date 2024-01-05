class Demo1Ex1
{
	int a;
	int b;
	Demo1Ex1()
	{
		a=10;
		b=20;
	}
	Demo1Ex1(int m, int n)
	{
		a=m;
		b=n;
	}
}

class Demo2Ex1 extends Demo1Ex1
{
	int c;
	int d;

	Demo2Ex1()
	{
		c=30;
		d=40;
	}

	Demo2Ex1(int p,int q)
	{
		c=p;
		d=q;
	}

	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
    }
}

class LaunchEx1
{
	public static void main(String args[])
	{
		Demo2Ex1 x=new Demo2Ex1();
		x.disp();
	}
}

