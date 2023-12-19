class F
{
	public static void main(String[] args)
	{
		System.out.println("From main begin");
		test();
		System.out.println("From main end");
	}
	public static void test() 
	{
		System.out.println("From test");
		if(true)
		{
			for (int i = 1; i <=2; i++)
			{
				int j = 0;
				while (j <= 1)
				{
					int k = 10;
					do
					{	
						System.out.println("from do-while body");
						k++;
					}
					while (k <= 12);
					j++;
				}
			}
		}
		System.out.println("from test end");
	}
	
	
}

//we will now call for the user defined method
//any no of valid statements we can keep under test method

