import java.util.Scanner;
class Launch4
{
	public static void main(String[] args) 
	{
		System.out.println("Program Start");
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the numerator");
			int a=scan.nextInt();
			System.out.println("Enter the denominator");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
			System.out.println("Enter the size of the array");
			int size=scan.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter the element to be inserted");
			int ele=scan.nextInt();
			System.out.println("Enter the position");
			int pos=scan.nextInt();
			arr[pos]=ele;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Enter a proper denominator");
		}
		catch(NegativeArraySizeException f)
		{
			System.out.println("Negative Size Array not Possible");
		}
		catch(ArrayIndexOutOfBoundsException g)
		{
			System.out.println("Be within your limits");
		}
		catch(Exception h)//Any Exception which is not handled in above catch block than this Exception class will cath the ERROR
		{
			System.out.println("Enter a valid input");
		}
		System.out.println("Progeam Ends");
	}
}
