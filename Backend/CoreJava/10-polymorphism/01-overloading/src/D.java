class  D
{
	static void test(int i)
	{
		System.out.println("test(int)");
	}
	static String test(String str) //methods para has to be diff if methods are having same no. of args. 
	{
		System.out.println("test(String)");
		return "abc";
	}
	static char test(float f, double d)
	{
		System.out.println("test(float, double)");
		return 'a';
	}
	static boolean test(char ch, String str, boolean b)
	{
		System.out.println("test(char, String, boolean)");
		return true;
	}

	public static void main(String[] args) 
	{
		D.test(10);
		D.test("abc");
		D.test(10.0f, 20.0);
		D.test('a', "abc", true);
		System.out.println("done");
	}
}

//method return type can be same or diff
//Method parameters data type can be anything but it should be different for each methods.

//only name should be same.

//NOTE: PARAMETER == ARGUMENT == SIGNATURE 