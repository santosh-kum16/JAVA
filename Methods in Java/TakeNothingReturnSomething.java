class TakeNothingReturnSomething
{
	public static void main(String[] args) 
	{
		Calculator cal = new Calculator();
		int res;
		res=cal.add();  //Here we are receiving the result which is returned by Calculator class
		System.out.println(res);
	}
}

class Calculator
{
	int a,b,c;
	int add()
	{
		a=10;
		b=20;
		c=a+b;
		return c;
	}
}
