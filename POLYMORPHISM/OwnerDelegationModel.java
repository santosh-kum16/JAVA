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
class Supervisor
{
	Worker w = new Worker();
	void dust()
	{
		w.dust();
	}
	void sweep()
	{
		w.sweep();
	}
	void wash()
	{
		w.wash();
	}

}
class LaunchOwnerDelegationModel
{
	public static void main(String args[])
	{
		Supervisor s = new Supervisor();
		s.dust();
		s.sweep();
		s.wash();
	}
}
