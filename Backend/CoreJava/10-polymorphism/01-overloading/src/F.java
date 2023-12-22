class  F
{
	public void test()
	{
		System.out.println("test()");
	}
	protected String test(String str)
	{
		System.out.println("test(String)");
		return "abc";
	}
	private char test(float f, double d)
	{
		System.out.println("test(float, double)");
		return 'a';
	}
	//default
	boolean test(char ch, String str, boolean b)
	{
		System.out.println("test(char, String, boolean)");
		return true;
	}

	public static void main(String[] args) 
	{
		F f1 = new F();
		f1.test();
		f1.test("abc");
		f1.test(10.0f, 20.0);
		f1.test('a', "abc", true);
		System.out.println("done");
	}
}

/*Q. What are all the rules for overloading?
1. We can achieve overloading in the same class. 
2. Method name can be same. <==========***
3. Method parameters should be different.
4. Return type can be same or different.
5. Access specifiers can be same or different.
*/