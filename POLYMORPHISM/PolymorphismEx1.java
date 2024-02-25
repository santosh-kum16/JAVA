class Animal
{
	void eat()
	{
		System.out.println("Animal can eat");
	}
	void sleep()
	{
		System.out.println("Animal can sleep");
	}
	 void breadth()
	{
		System.out.println("Animal is taking breadth");
	}
}
class Tiger extends Animal
{
	void eat()
	{
		System.out.println("Tiger is hunt Animal then eat");
	}
}
class Deer extends Animal
{
	void eat() 
	{
		System.out.println("Deer is grazing grass");
	}
}
class Monkey extends Animal
{
	void eat()
	{
		System.out.println("Monkey is steal and eat");
	}
}
class Forest
{
	void permit(Animal ref)
	{
		ref.breadth();
		ref.eat();
		ref.sleep();
		System.out.println();
	}
}
class LaunchAnimalPolymorphism
{
	public static void main(String args[])
	{
		Tiger t=new Tiger();
		Deer d=new Deer();
		Monkey m=new Monkey();
		Forest f=new Forest();

		f.permit(t);
		f.permit(d);
		f.permit(m);

		
	}
}
