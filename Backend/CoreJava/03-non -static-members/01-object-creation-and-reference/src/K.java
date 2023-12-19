class K 
{
	void test1()
	{
		System.out.println("from test1");
	}
	static void test2()
	{
		K obj = new K();
		obj.test1();
		System.out.println("from test2");
	}
}

//syn proper but no main method to run it.