class G 
{
	static void test(double d)
	{
		System.out.println("test(double)");
		System.out.println("d: " + d);
	}

	public static void main(String[] args) 
	{
		int i = 100;
		test(i);
		System.out.println("done");
		System.out.println("i: " + i);
	}
}

//int i will get upcasted to double in test() method