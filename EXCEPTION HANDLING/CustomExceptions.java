import java.util.Scanner;
class UnderAgeException extends Exception
{
	public String getMessage()
	{
		return "You are under age for applying Driving License age must be greater than 18 years";
	}
}

class OverAgeException extends Exception
{
	public String getMessage()
	{
		return "You are over age for applying Driving License age must be less than 60 years";
	}
}

class Dto
{
	int age;
	void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		age=scan.nextInt();
	}

	void verify()throws UnderAgeException,OverAgeException
	{
		if ((age>=18)&&(age<=60))
		{
			System.out.println("You are eligible for applying a Driving Lisence");
		}
		else if(age<18)
		{
			UnderAgeException uae = new UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age>60)
		{
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}
	}
}

class Rto
{
	void initiate()
	{
		Dto d = new Dto();
		try
		{
			d.input();
			d.verify();
		}
		catch (UnderAgeException uae)
		{
			System.out.println(uae.getMessage());
		}
		catch (OverAgeException oae)
		{
			System.out.println(oae.getMessage());
		}
		catch (Exception e)
		{
			System.out.println("Enter valid input");
		}
	}
}

class LaunchDLCustomException
{
	public static void main(String args[])
	{
		Rto r = new Rto();
		r.initiate();
	}
}
