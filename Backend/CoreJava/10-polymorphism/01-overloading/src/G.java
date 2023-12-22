class  G
{
	static public void test()
	{
		System.out.println("test()");
	}
	static protected String test(String str)
	{
		System.out.println("test(String)");
		return "abc";
	}
	static private char test(float f, double d)
	{
		System.out.println("test(float, double)");
		return 'a';
	}
	//default
	static boolean test(char ch, String str, boolean b)
	{
		System.out.println("test(char, String, boolean)");
		return true;
	}

	public static void main(String[] args) 
	{
		G g1 = new F();
		g1.test();
		g1.test("abc");
		g1.test(10.0f, 20.0);
		g1.test('a', "abc", true);
		System.out.println("done");
	}
}

//static public or public static - we can shuffle, 
//but by convention we go with acceess modifier (public) and then access specifier(static).