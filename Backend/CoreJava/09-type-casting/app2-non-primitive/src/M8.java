class M8 
{
	static void test(A obj)
	{
		System.out.println("from test(A)");
	}

	public static void main(String[] args) 
	{
		test(new B()); //creating new object while supplying 
		test(new C());
		test(new D());

		B b1 = new B();
		test(b1);

		D d1 = new D();
		test(d1);
		System.out.println("done");
	}
}

//sending B, C, D type of object which are automatically upcasted to A