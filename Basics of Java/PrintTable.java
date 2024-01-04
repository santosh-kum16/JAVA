import java.util.Scanner;
class PrintTable 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter any number for print their table:");
		int num;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		System.out.println("You entered "+num+" and table is below.\n");
		for(int i=1; i<11; i++)
		{
			int tables = num*i;
			System.out.println(tables);
		}
	}
}
