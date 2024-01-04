class Dog7
{
	private String name;
	private String color;
	private int cost;

	Dog7(String name,String color,int cost)
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
	Dog7()
	{
		
	}
}
class CreateDog7
{
	public static void main(String args[])
	{
		Dog7 d1=new Dog7("Tommy","Black",5000);
		
		System.out.println(d1.getName());
		System.out.println(d1.getColor());
		System.out.println(d1.getCost());

		Dog7 d2=new Dog7();

		System.out.println(d2.getName());
		System.out.println(d2.getColor());
		System.out.println(d2.getCost());
	}
}
