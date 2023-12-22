class N 
{
	static void test1(double d)
	{
			System.out.println("from test(double)");
	}

	public static void main(String[] args) 
	{
		int i = 10;
		test1(i);		
		System.out.println("---------");
		test1((double)i); //upcasting explicitely before sending.
		System.out.println("---------");
	}
}

//not necessary