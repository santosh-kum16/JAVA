class Calculator
{
	int add(int x,int y)
	{
		return x+y;
	}
	float add(int x,float y)
	{
		return x+y;
	}
	double add(int x,double y)
	{
		return x+y;
	}
	float add(float x,float y)
	{
		return x+y;
	}
	int add(int x,int y,int z)
	{
		return x+y+z;
	}
	double add(int x,float y,double z)
	{
		return x+y+z;
	}
	double add(int x,double y,double z)
	{
		return x+y+z;
	}
	float add(float x,int y)
	{
		return x+y;
	}
}

class Launch
{
	public static void main (String args[])
	{
		int a=10,b=20,c=30;
		float x=10.5f,y=20.5f,z=30.5f;
		double m=15.2,n=23.4,o=45.6;

		Calculator calc = new Calculator();
		
		System.out.println(calc.add(a,b));
		System.out.println(calc.add(a,x,m));
		System.out.println(calc.add(a,x));
	}
}
