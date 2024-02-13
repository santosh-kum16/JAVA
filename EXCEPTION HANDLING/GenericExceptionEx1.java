import java.util.Scanner;
class GenericExceptionEx1
{
	public static void main(String[] args) 
	{
		System.out.println("Start of the Program *************************************");
		try
		{
			Scanner scan = new Scanner(System.in);

			System.out.println("Enter the numerator");
			int a=scan.nextInt();

			System.out.println("Enter the denominator");
			int b=scan.nextInt();

			int c=a/b;
			System.out.println("The Quotient is: "+c);

			System.out.println("Enter the size of the array");
			int size=scan.nextInt();
			int arr[]=new int[size];

			System.out.println("Enter the element to be inserted");
			int ele=scan.nextInt();

			System.out.println("Enter the position");
			int pos=scan.nextInt();
			arr[pos]=ele;
		}
		catch(Exception e)
		{
			System.out.println("Enter a valid input");
		}
		System.out.println("End of the Program*******************************");
	}
}
