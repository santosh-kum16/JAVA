class TakeNothingReturnNothing
{
	public static void main(String[] args) 
	{
		Calculator cal = new Calculator();
		cal.add();
	}
}

class Calculator
{
	int a,b,c;
	void add()
	{
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}
}
