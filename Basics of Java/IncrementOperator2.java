class IncrementOperatorEx2 
{
	public static void main(String[] args) 
	{
		int a=10;	//variable a declare integer and initialized to 10
		int b;	// variable b is declared as INTEGER type and so by default, it initialized with 0 (ZERO)
		++a; 	// pre-increment operator so now the value of a is 11
		b=a;	// value of a=11 is assigned to b, now the value of b is 11
		System.out.println(a);	//11
		System.out.println(b);	//11
	}
}


class IncrementOperatorEx3 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b;
		b=a++;	//Here POST-INCREMENT operator is used, the value of a=10 is assigned to b i.e 10, and then increment value of a by 1
		System.out.println(a); //11
		System.out.println(b);	//10
	}
}


class IncrementOperatorEx4
{
	public static void main(String[] args) 
	{
		int a=10;
		int b;
		b=++a;	//PRE-INCREMENT operator is used for var a and assigned to variable b
		System.out.println(a);	//11
		System.out.println(b);	//11
	}
}


class IncrementOperatorEx5
{
	public static void main(String[] args) 
	{
		int a=10;
		a=a+++ ++a;	// 10 = 10 + 11 and again var a is increased by value 1 because of the post-increment operator
		System.out.println(a);	//22
	}
}
