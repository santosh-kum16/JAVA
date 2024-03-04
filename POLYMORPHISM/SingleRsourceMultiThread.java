class Bathroom implements Runnable
{
	public void run()
	{
		try
		{
			System.out.println(Thread.currentThread().getName()+"has entered the bathroom");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+"is using the bathroom");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+"has exited the bathroom");
		}
		catch (Exception e)
		{
			System.out.println("Something happen Wrong!!!");
		}
	}
}

class SingleRsourceMultiThread
{
	public static void main(String args[])
	{
		Bathroom b = new Bathroom();
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);

		t1.setName("MALE ");
		t2.setName("FEMALE ");
		t3.setName("OTHER ");

		t1.start();
		t2.start();
		t3.start();
	}
}
