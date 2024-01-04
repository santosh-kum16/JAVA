class Dog4
{
	private String name;
	private String color;
	private int cost;

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

class LaunchDog4
{
	public static void main(String args[])
	{
		Dog4 d=new Dog4();

		System.out.println(d.getName());
		System.out.println(d.getColor());
		System.out.println(d.getCost());
	}
}
