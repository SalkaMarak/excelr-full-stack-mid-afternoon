interface A1
{
	void test1();
}
interface B1
{
	void test2();
}
interface C1
{
	void test3();
}
interface D1
{
	void test4();
}
class V implements A1, B1, C1, D1
{
	public void test1()
	{
		System.out.println("from test1()");
	}
	public void test2()
	{
		System.out.println("from test2()");
	}
	public void test3()
	{
		System.out.println("from test3()");
	}
	public void test4()
	{
		System.out.println("from test4()");
	}
	public static void main(String[] args)
	{
		V obj = new V();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		System.out.println("done");
	}
}

 //we can acheive multiple interitence through interfaces in java by using comma as a separator. (any no of interfaces)