class C 
{
	void test()
	{
		System.out.println("from test-C");
	}
}
class D extends C
{
	void test()
	{
		System.out.println("from test-D");
	}

	public static void main(String[] args) 
	{
		C c1 = new D(); //reference is C type and object is D type
		c1.test();
		System.out.println("done");
	}
}

//output: from test-D \n done
//overriding can be achieve through sub-class only

//superclass reference can hold subclass object.
//object ceation matters thats why we getting from test-D