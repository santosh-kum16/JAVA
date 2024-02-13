import java.util.Scanner;
class Launch1
{
	public static void main(String[] args) 
	{
		System.out.println("Below we can see Arithmetic Exception Handling.");
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the numerator");
			int a=scan.nextInt();
			System.out.println("Enter the denominator");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println("The quotient is: "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Enter a proper denominator"); //Exception message
		}
		System.out.println("Connection terminated"); //If exception occur this line will not be execute
	}
}
