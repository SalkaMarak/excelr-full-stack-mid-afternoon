class K 
{
	static int x =0;
	static void test1()
	{
		System.out.println("from test1: " + x);
		x = 1;
	}
	static void test2()
	{
		System.out.println("from test2: " + x);
		x = 2;
	}
	public static void main(String[] args) 
	{
		test1();
		System.out.println("main1 end: " + x);
		test2();
		System.out.println("main2 end: " + x);
		
	}
}



