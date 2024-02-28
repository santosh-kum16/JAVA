class Parent
{
	void cry()
	{
		System.out.println("Parent cry when Child is crying");
	}
}
class Child1 extends Parent
{
	void cry()
	{
		System.out.println("Child1 cry at low low voice");
	}
	void eat()
	{
		System.out.println("Child1 eat less food");
	}
}
class Child2 extends Parent
{
	void cry()
	{
		System.out.println("Child2 cry at mid voice");
	}
	void eat()
	{
		System.out.println("Child2 eat Sufficient food");
	}
}
class Child3 extends Parent
{
	void cry()
	{
		System.out.println("Child3 cry at high voice");
	}
	void eat()
	{
		System.out.println("Child3 eat More food");
	}
}
class LaunchParentPolymorphismV1DownCasting
{
	public static void main(String args[])
	{
		Child1 c1=new Child1();
		Child2 c2=new Child2();
		Child3 c3=new Child3();

		Parent ref;

		ref=c1;
		ref.cry();
		((Child1)(ref)).eat();
		System.out.println();

		ref=c2;
		ref.cry();
		((Child2)(ref)).eat();
		System.out.println();

		ref=c3;
		ref.cry();
		((Child3)(ref)).eat();
	}
}
