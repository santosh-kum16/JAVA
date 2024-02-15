import java.util.Scanner;
class Demo1
{
	void fun1() 
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
		}		
		System.out.println("Connection 2 Terminated");
	}
}

class LaunchDemo7
{
	public static void main(String args[])
	{
		System.out.println("Connection1 1 Established");
		Demo1 d1 = new Demo1();
		d1.fun1();
		System.out.println("Connection 1 Terminated");
	}
}
