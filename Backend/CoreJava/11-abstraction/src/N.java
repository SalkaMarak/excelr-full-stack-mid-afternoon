abstract class L
{
	abstract void test1();
	abstract void test2();
	abstract void test3();
}
abstract class M extends L
{ 
	void test1()
	{
		System.out.println("form test1()");
	}
	void test2()
	{
		System.out.println("form test2()");
	}
}
class N extends M
{
	void test3()
	{
		System.out.println("form test2()");
	}
	public static void main(String[] args)
	{
		N obj1 = new N();
		obj1.test1();
		obj1.test2();
		obj1.test3();
		System.out.println("done");
	}
}

//test1 in the class M is overriding abstract test1 in the L class and same for test2 but test3 implemented in class N.

//we have to name class M abstract because test3 is still abstract and not yet implimented thats why we have to carry on to next class.

//we can only create an objext in non abstract class..