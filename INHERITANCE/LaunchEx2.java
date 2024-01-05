class Demo1Ex2
{
	int a;
	int b;
	Demo1Ex2()
	{
		a=10;
		b=20;
	}
	Demo1Ex2(int m, int n)
	{
		a=m;
		b=n;
	}
}

class Demo2Ex2 extends Demo1Ex2
{
	int c;
	int d;

	Demo2Ex2()
	{
		c=30;
		d=40;
	}

	Demo2Ex2(int p,int q)
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

class LaunchEx2
{
	public static void main(String args[])
	{
		Demo2Ex2 x=new Demo2Ex2(11,22);
		x.disp();
	}
}

