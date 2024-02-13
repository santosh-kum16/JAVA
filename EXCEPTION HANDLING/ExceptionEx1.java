import java.util.Scanner;
class ExceptionEx1
{
	public static void main(String[] args) 
	{
		System.out.println("Below we can see, Exceptions can be generated due to faulty input.");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numerator");
		int a=scan.nextInt();
		System.out.println("Enter the denominator");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println("The quotient is: "+c);
		System.out.println("Connection terminated");
	}
}
