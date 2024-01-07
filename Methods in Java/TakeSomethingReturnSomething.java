class TakeSomethingReturnSomething
{
	public static void main(String[] args) 
	{
		Calculator cal = new Calculator();
		int a, b, res;
		a = 10;
		b = 20;
		res = cal.add(a,b);  //add() is called by passing value and also Received sum of both integer
		System.out.println(res);
	}
}

class Calculator  //Here defied a Calculator class
{
	int temp;
	int add(int x, int y) // Method declaration and its RETURN Type is integer
	{
		temp = x+y;
		return temp; // From here SUM of both integer (x=10, y=20) i.e 30 RETURN to method called
	}
}
