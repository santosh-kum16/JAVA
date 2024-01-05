class Demo1Ex4
{
	int a;
	int b;
	Demo1Ex4()
	{
		a=10;
		b=20;
	}
	Demo1Ex4(int m, int n)
	{
		a=m;
		b=n;
	}
}

class Demo2Ex4 extends Demo1Ex4
{
	int c;
	int d;

	Demo2Ex4()
	{
		this(111,222);
		c=30;
		d=40;
	}

	Demo2Ex4(int p,int q)
	{
		super(100,200);
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

class LaunchEx4
{
	public static void main(String args[])
	{
		Demo2Ex4 x=new Demo2Ex4();
		x.disp();
	}
}

