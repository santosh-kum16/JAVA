class Dog1
{
	private String name;
	private String color;
	private int cost;

	Dog1(String x,String y, int z)
	{
		name=x;
		color=y;
		cost=z;
	}

	String getName()
	{
		return name;
	}
	String getColor()
	{
		return color;
	}
	int getCost()
	{
		return cost;
	}
}

class LaunchDog1 
{
	public static void main(String[] args) 
	{
		Dog1 d = new Dog1("Tommy","Black",10000);

		System.out.println(d.getName());
		System.out.println(d.getColor());
		System.out.println(d.getCost());
	}
}
