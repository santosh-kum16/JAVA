import java.util.Scanner;

class Demo1 extends Thread
{
	public void run()
	{
		System.out.println("Banking Started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter account number");
		int an = scan.nextInt();
		System.out.println("Enter the password");
		int pw = scan.nextInt();
		System.out.println("Collect your money");
		System.out.println("Banking completed");
	}
}

class Demo2 extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Printing started");
			for (int i=0 ; i<5 ; i++ )
			{
				System.out.println("ABC");
				Thread.sleep(5000);
			}	
		}
		catch (Exception e)
		{
			System.out.println("Printing Interrupted");
		}
		
		System.out.println("Printing completed");
	}
}

class Demo3 extends Thread
{
	public void run()
	{
		System.out.println("Addition started");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		System.out.println("Addition completed");
	}
}


class MultiThreadDemo
{
	public static void main(String[] args)
	{
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();

		d1.start();
		d2.start();
		d3.start();
	}
}
