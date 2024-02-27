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
}
class Child2 extends Parent
{
	void cry()
	{
		System.out.println("Child2 cry at mid voice");
	}
}
class Child3 extends Parent
{
	void cry()
	{
		System.out.println("Child3 cry at high voice");
	}
}
class LaunchParentPolymorphismV1
{
	public static void main(String args[])
	{
		Child1 c1=new Child1();
		Child2 c2=new Child2();
		Child3 c3=new Child3();

		Parent ref;

		ref=c1;
		ref.cry();

		ref=c2;
		ref.cry();

		ref=c3;
		ref.cry();
	}
}
