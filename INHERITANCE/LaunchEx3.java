class Demo1Ex3
{
	int a;
	int b;
	Demo1Ex3()
	{
		a=10;
		b=20;
	}
	Demo1Ex3(int m, int n)
	{
		a=m;
		b=n;
	}
}

class Demo2Ex3 extends Demo1Ex3
{
	int c;
	int d;

	Demo2Ex3()
	{
		c=30;
		d=40;
	}

	Demo2Ex3(int p,int q)
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

class LaunchEx3
{
	public static void main(String args[])
	{
		Demo2Ex2 x=new Demo2Ex2(11,22);
		x.disp();
	}
}

