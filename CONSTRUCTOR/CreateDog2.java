class Dog2
{
	private String name;
	private String color;
	private int cost;

	Dog2(String name,String color, int cost)
	{
		name=name;
		color=color;
		cost=cost;
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

class LaunchDog2 
{
	public static void main(String[] args) 
	{
		Dog2 d = new Dog2("Tommy","Black",10000);

		System.out.println(d.getName());
		System.out.println(d.getColor());
		System.out.println(d.getCost());
	}
}
