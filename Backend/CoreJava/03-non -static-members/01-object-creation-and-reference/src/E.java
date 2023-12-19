class E 
{
	void test1() 
	{
		System.out.println("from test1");
	}
	static void test2() 
	{
		test1();
		System.out.println("from test2");
	}
}

//ERROR: non-static method test1() cannot be referenced from a static context.