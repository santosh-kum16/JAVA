class TakeSomethingReturnNothing
{
	public static void main(String[] args) 
	{
		Calculator calc = new Calculator();
		int a,b;
		a=10;
		b=20;
		calc.add(a,b);
	}
}

class Calculator
{
	int temp;
	void add(int x,int y)
	{
		temp=x+y;
		System.out.println(temp);
	}
}
