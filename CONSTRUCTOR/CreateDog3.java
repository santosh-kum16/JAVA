class Dog3
{
	private String name;
	private String color;
	private int cost;

	Dog3(String name,String color, int cost)
	{
		this.name=name;
		this.color=color;
		this.cost=cost;
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

class LaunchDog3 
{
	public static void main(String[] args) 
	{
		Dog3 d = new Dog3("Tommy","Black",10000);

		System.out.println(d.getName());
		System.out.println(d.getColor());
		System.out.println(d.getCost());
	}
}
