class WhileInsideWhile 
{
	public static void main(String[] args) 
	{
		int x=5;
		int y=3;
		while (x>0)
		{
			System.out.println("First while");
			while (y>0)
			{
				System.out.println("2nd while");
				y--;
			}
			x--;
			y=3;
		}
	}
}
