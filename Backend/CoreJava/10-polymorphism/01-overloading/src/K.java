class J 
{
	public static void test()
	{
		System.out.println("from J test()");
	}

}
class K extends J
{
	public static void test(int i)
	{
			System.out.println("from K test(int)");
	}
	public static void main(String[] args) 
	{
		test();				//or K.test(); or J.test()
		test(10);			//or K.test(10);
		System.out.println("done");
	}
}
