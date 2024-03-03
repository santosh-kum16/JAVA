import java.util.Scanner;
class LaunchSingleThread extends Thread
{
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Banking Started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter account number");
		int an = scan.nextInt();
		System.out.println("Enter the password");
		int pw = scan.nextInt();
		System.out.println("Collect your money");
		System.out.println("Banking completed");

		System.out.println("Printing started");
		for (int i=0 ; i<5 ; i++ )
		{
			System.out.println("Inside for loop");
			Thread.sleep(5000);
		}
		
		System.out.println("Printing completed");

		System.out.println("Addition started");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		System.out.println("Addition completed");
	}
}
