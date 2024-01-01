abstract class J
{
	abstract void test1();
	abstract void test2();

	void test3()
	{
		System.out.println("from test3()");
	}
}
class K extends J
{
	@Override //if we using ide we will get this statement
	void test1()
	{
		System.out.println("form test1()");
	}
	void test2()
	{
		System.out.println("form test2()");
	}

	public static void main(String[] args)
	{
		K obj1 = new K();
		obj1.test1();
		obj1.test2();
		obj1.test3();
		System.out.println("done");
	}
}

//we must give implementation in the child class I for all abstract methods

//test1 in the class J is overriding abstract test1 in the K class and same for test2 but test3 is already implemented in class J.
