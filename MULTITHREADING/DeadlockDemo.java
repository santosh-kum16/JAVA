class Warrior extends Thread
{
	String res1 = "Brahmastra";
	String res2 = "Pashupatastra";
	String res3 = "Sarpastra";

	public void run()
	{
		if (getName().equals("RAMA"))
		{
			resAccRama();
		}
		else
		{
			resAccRavana();
		}
	}
	
	void resAccRama()
	{
		try
		{
			synchronized (res1)
			{
				System.out.println("Rama has accuired "+ res1);
				Thread.sleep(5000);
				synchronized (res2)
				{
					System.out.println("Rama has accuired "+ res2);
					Thread.sleep(5000);
					synchronized (res3)
					{
						System.out.println("Rama has accuired "+ res3);
						Thread.sleep(5000);

					}
				}
			}
		}
		catch (Exception e)
		{
			System.out.println("Interrupted");
		}
	}

	void resAccRavana()
	{
		try
		{
			synchronized (res3)
			{
				System.out.println("Ravana has accuired "+ res3);
				Thread.sleep(5000);
				synchronized (res2)
				{
					System.out.println("Ravana has accuired "+ res2);
					Thread.sleep(5000);
					synchronized (res1)
					{
						System.out.println("Ravana has accuired "+ res1);
						Thread.sleep(5000);

					}
				}
			}
		}
		catch (Exception e)
		{
			System.out.println("Interrupted");
		}
	}
}

class LaunchDeadlock
{
	public static void main(String args[])
	{
		Warrior w1 = new Warrior();
		Warrior w2 = new Warrior();
		w1.setName("RAMA");
		w2.setName("RAVANA");

		w1.start();
		w2.start();
	}
}
