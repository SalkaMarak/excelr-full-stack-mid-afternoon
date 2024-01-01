interface S
{
	void test1();
}
interface T
{
	void test2();
}
class U implements S, T
{
	public void test1()
	{
		System.out.println("from test1()");
	}
	public void test2()
	{
		System.out.println("from test2()");
	}
	public static void main(String[] args)
	{
		U obj = new U();
		obj.test1();
		obj.test2();
		System.out.println("done");
	}
}

 //we can acheive multiple interitence through interfaces in java by using comma as a separator. (any no of interfaces)