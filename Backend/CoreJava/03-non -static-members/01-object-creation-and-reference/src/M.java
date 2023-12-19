class M 
{
	void test1()
	{
		System.out.println("from test1");
	}

	static
	{
		M obj = new M();
		obj.test1();
	}
}

//Till java jdk 1.6 we were able to run a program w/o main method.