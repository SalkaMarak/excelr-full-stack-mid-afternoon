interface A2
{
	void test1();
}
interface B2
{
	void test2();
}
interface C2
{
	void test3();
}
abstract class D2 implements A2, B2, C2
{
	public void test1()
	{
		System.out.println("from test1()");
	}
	public void test2()
	{
		System.out.println("from test2()");
	}
}
class W extends D2
{
	public void test3()
	{
		System.out.println("from test3()");
	}
	public static void main(String[] args)
	{
		W obj = new W();
		obj.test1();
		obj.test2();
		obj.test3();
		System.out.println("done");
	}
}

 //we can acheive multiple interitence through interfaces in java by using comma as a separator. (any no of interfaces)