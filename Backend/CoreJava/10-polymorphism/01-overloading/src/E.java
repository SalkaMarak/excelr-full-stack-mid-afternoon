class  E
{
	void test()
	{
		System.out.println("test()");
	}
	String test(String str)
	{
		System.out.println("test(String)");
		return "abc";
	}
	char test(float f, double d)
	{
		System.out.println("test(float, double)");
		return 'a';
	}
	boolean test(char ch, String str, boolean b)
	{
		System.out.println("test(char, String, boolean)");
		return true;
	}

	public static void main(String[] args) 
	{
		E e1 = new E();
		e1.test();
		e1.test("abc");
		e1.test(10.0f, 20.0);
		e1.test('a', "abc", true);
		System.out.println("done");
	}
}