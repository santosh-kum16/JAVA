class PatternEx1
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		System.out.print("* "); // ***** 5 Start print in one row
	}
}


class PatternEx2
{
	public static void main(String[] args) 
	{
		for(int j=1;j<=5;j++)
		{
			for(int i=1;i<=5;i++)
			{
				System.out.print("* "); // its print 5 row and 5 col
			}
			System.out.println();
		}
	}
}

class PatternEx3 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i+1;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=5;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}


class PatternEx4
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=(5-i+1);k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++)
			{
				if(i==1||i==5||j==1||j==5)
				{
					System.out.print("*");
	
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}


import java.util.Scanner;
class PatternHE1
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number how many PATTERN you want to PRINT: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a;
		for ( int i=0; i<n; i++ )
		{
			System.out.println();
			a = scan.nextInt();

			for (int j=1; j<=a; j++ )
			{	
				for (int k=0; k<j; k++ )
				{
					System.out.print("*");
				}
				for (int l=0; l<(a*2)-(j*2) ;l++ )
				{
					System.out.print("#");
				}
				for (int k=0; k<j ;k++ )
				{
					System.out.print("*");
				}
				System.out.println();
				
			}
		}
		
	}
}

