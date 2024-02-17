import java.util.Scanner;
class Demo1
{
	void fun1() throws ArithmeticException 
	{
			Scanner scan = new Scanner(System.in);
		
			System.out.println("Enter the numerator");
			int a=scan.nextInt();
    
			System.out.println("Enter the denominator");
			int b=scan.nextInt();
    
			int c=a/b;
			System.out.println("Quotient are: "+c);
		
	}
}

class LaunchDemo9
{
	public static void main(String args[])
	{
		System.out.println("Program Start !!!");
		try
		{
			Demo1 d1 = new Demo1();
			d1.fun1();	
		}
		catch (ArithmeticException e)
		{
			System.out.println("Problem resolved in main()");
		}
		catch(Exception genex){
			System.out.println("Please try Proper Input!!!");
    }
		System.out.println("Program End !!!");
	}
}
