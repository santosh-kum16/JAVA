class Dog6
{
	private String name;
	private String color;
	private int cost;

	Dog6(String name,String color,int cost)
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
class CreateDog6
{
	public static void main(String args[])
	{
		Dog6 d1=new Dog6("Tommy","Black",5000);
		
		System.out.println(d1.getName());
		System.out.println(d1.getColor());
		System.out.println(d1.getCost());

		Dog6 d2=new Dog6();

		System.out.println(d2.getName());
		System.out.println(d2.getColor());
		System.out.println(d2.getCost());
	}
}
