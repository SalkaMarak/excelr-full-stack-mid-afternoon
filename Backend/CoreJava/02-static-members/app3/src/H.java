class H
{
	static
	{
		 System.out.println(i = 10);
	}
	static int i = 20;

	static
	{
		 System.out.println(i);
	}

	public static void main(String[] args)
	{
		System.out.println(i);
	}
		static
	{
		 i = 30;  //this will load before main method
	}
}

/*
10
20
30
*/
