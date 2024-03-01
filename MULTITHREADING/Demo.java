class Demo
{
	public static void main(String args[])
	{
		System.out.println("Hello Everyone");
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("Test");
		t.setPriority(10);
		System.out.println(t);	
	}
}
