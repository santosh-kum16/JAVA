class Dog9
{
	private String name;
	private String color;
	private int cost;

	Dog9()
	{
		this("zozoo");
		name="Tommy";
		color="Black";
		cost=5000;
	}

	Dog9(String name,String color,int cost)
	{
		this();
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

	Dog9(String name)
	{
		this.name=name;
	}
}
class LaunchDog9
{
	public static void main(String args[])
	{
		Dog9 d1=new Dog9();
		
		System.out.println(d1.getName());
		System.out.println(d1.getColor());
		System.out.println(d1.getCost());

		Dog9 d2=new Dog9("Jimmy","White",3000);

		System.out.println(d2.getName());
		System.out.println(d2.getColor());
		System.out.println(d2.getCost());
	}
}
