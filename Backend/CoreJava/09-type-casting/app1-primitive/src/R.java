class R 
{
	static void test(int i)
	{
		System.out.println("test(int): " + i);
	}

	public static void main(String[] args) 
	{
		byte b = 10;
		test(b);
		double d = 10.0;
		//test(d); - we cannot do like this here
		test((int)d);
		System.out.println("done");
	}
}

