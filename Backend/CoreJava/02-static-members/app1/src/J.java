class J 
{
	static byte i;
	static void test()
	{
		System.out.println("from test: " + J.i);
	}
	public static void main(String[] args) 
	{
		System.out.println(I.i);
		J.i = 10;
		J.test();
	}
}

//(J.) here is class reference.

