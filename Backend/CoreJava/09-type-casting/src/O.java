class O 
{
	static int test1()
	{
		byte b = 10;
		return b;
	}

	static int test2()
	{
		byte b = 10;
		return (int)b; //exp
	}

	public static void main(String[] args) 
	{
		double d1 = test1();
		double d2 = (double)test2(); //exp
		System.out.println("d1: " + d1 + " d2: " + d2);
		System.out.println("done");
	}
}

//explicitely upcasting is not necessary