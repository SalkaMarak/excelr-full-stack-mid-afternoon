class M3 
{
	public static void test1(A obj)
	{
		System.out.println("test1(A): " + obj); //this
	}
	public static void test2(B obj)
	{
		System.out.println("test2(B): " + obj); //that
	}

	public static void main(String[] args) 
	{
		A a1 = new A();
		test1(a1);

		B b1 = new B();
		test2(b1);

		System.out.println(a1); //this
		System.out.println(b1); //that

		System.out.println("------------------------");

		A a2 = new A();
		test1(a2);

		B b2 = new B();
		test2(b2);

		System.out.println(a2); //this
		System.out.println(b2); //that

		System.out.println("done");
	}
}

//this and this memory location will be same, and that and that will be same.
//because the objects here have two references and they both point to the same object