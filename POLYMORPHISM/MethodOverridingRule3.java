class Animal
{

}
class Tiger extends Animal
{

}

class Demo1
{
	 Animal disp()
	{
		System.out.println("Class Demo 1");
		Animal a = new Animal();
		return a;
	}
}
class Demo2 extends Demo1
{
	Tiger disp()
	{
		System.out.println("Class Demo 2");
		Tiger t = new Tiger();
		return t;
	}
}
class LaunchMethodOverridingRule3
{
	public static void main(String args[])
	{
		Demo2 d = new Demo2();
		d.disp();
	}		
}	
