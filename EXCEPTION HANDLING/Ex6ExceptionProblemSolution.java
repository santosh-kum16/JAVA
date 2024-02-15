import java.util.Scanner;
class Demo1
{
	void fun1() throws ArithmeticException 
	{
		System.out.println("Connection 2 Established");
		try
		{
			Scanner scan = new Scanner(System.in);
		
			System.out.println("Enter the numerator");
			int a=scan.nextInt();
			System.out.println("Enter the denominator");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Problem resolved in fun1();");
			throw e;
		}
		finally
		{
			System.out.println("Connection 2 Terminated");
		}
	}
}

class LaunchDemo8
{
	public static void main(String args[])
	{
		System.out.println("Connection1 1 Established");
		try
		{
			Demo1 d1 = new Demo1();
			d1.fun1();	
		}
		catch (ArithmeticException f)
		{
			System.out.println("Problem resolved in main()");
		}
		
		System.out.println("Connection 1 Terminated");
	}
}
