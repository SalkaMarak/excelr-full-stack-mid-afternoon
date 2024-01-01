abstract class O
{
	abstract void test1();
	abstract void test2();
	abstract void test3();
}
abstract class P extends O
{ 
	void test1()
	{
		System.out.println("form test1()");
	}
	void test2()
	{
		System.out.println("form test2()");
	}
	void test3()
	{
		System.out.println("from test3()");
	}
	abstract void method1();
}
class Q extends P
{
	void method1()
	{
		System.out.println("form method1()");
	}
	public static void main(String[] args)
	{
		Q obj1 = new Q();
		obj1.test1();
		obj1.test2();
		obj1.test3();
		obj1.method1();
		System.out.println("done");
	}
}

//test1 in the class P is overriding abstract test1 in the O class and same for test2 and test3.

//we have to name class P abstract because new method1 is abstract and not yet implimented thats why we have to carry on to next class.

//we can only create an objext in non abstract class..