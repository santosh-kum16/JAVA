class StaticBlock
{
	
		static
	{
		System.out.println("Static Block Executed First");
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}

		static
	{
		System.out.println("Static Block in-side main method Executed");
	}

}
