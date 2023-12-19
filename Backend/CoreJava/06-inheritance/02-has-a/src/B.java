class A
{
	int i;

	void test1()
	{
		System.out.println("A-test1()");
	}
}
class B
{
	A obj; //creating a reference of A in B as a link

	B(A ref)
	{
		obj = ref;
	}
	void test2()
	{
		System.out.println("B-test2()");
		System.out.println(obj.i);
		obj.test1();
	}

	public static void main(String[] args) 
	{
		A a1 = new A();
		B b1 = new B(a1);
		b1.test2();
		System.out.println("done");
	}
}

