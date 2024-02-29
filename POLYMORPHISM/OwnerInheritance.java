class Worker
{
	void dust()
	{
		System.out.println("Dusting");
	}
	void sweep()
	{
		System.out.println("Sweeping");
	}
	void wash()
	{
		System.out.println("Washing");
	}

}
class Supervisor extends Worker
{

}
class LaunchOwnerInheritance
{
	public static void main(String args[])
	{
		Supervisor s = new Supervisor();
		s.dust();
		s.sweep();
		s.wash();
	}
}
