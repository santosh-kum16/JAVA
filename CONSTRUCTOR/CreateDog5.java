class Dog5
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
class LaunchDog5
{
	public static void main(String args[])
	{
		Dog5 d=new Dog5("Tommy","Black",10000);
		System.out.println(d.getName());
		System.out.println(d.getColor());
		System.out.println(d.getCost());
	}
}
