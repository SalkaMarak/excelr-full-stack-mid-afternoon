abstract class H
{
	abstract void test1();
	abstract void test2();
	abstract void test3();
}
class I extends H
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
	void test3()
	{
		System.out.println("form test3()");
	}

	public static void main(String[] args)
	{
		I obj1 = new I();
		obj1.test1();
		obj1.test2();
		obj1.test3();
		System.out.println("done");
	}
}

//we must give implementation in the child class I for all abstract methods

//test1 in the classI is overriding abstract test1 in the H class and same for test2 and 3.