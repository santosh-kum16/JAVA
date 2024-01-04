class Dog8
{
	private String name;
	private String color;
	private int cost;

	Dog8()
	{
		name="Tommy";
		color="Black";
		cost=5000;
	}

	Dog8(String name,String color,int cost)
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
}
class CreateDog8
{
	public static void main(String args[])
	{
		Dog8 d1=new Dog8();
		
		System.out.println(d1.getName());
		System.out.println(d1.getColor());
		System.out.println(d1.getCost());

		Dog8 d2=new Dog8("Jimmy","White",3000);

		System.out.println(d2.getName());
		System.out.println(d2.getColor());
		System.out.println(d2.getCost());
	}
}
