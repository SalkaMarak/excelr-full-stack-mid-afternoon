class X
{
	int i;

	static void test(X obj1, X obj2) //xi is appliedto obj1 and x2 to obj 2
	{
		int temp = obj1.i; //this temperory value is storing obj1 ie x1 value (i=10)
		obj1.i = obj2.i; //modify obj1 to obj2 value
		obj2.i = temp; //now we send temp(obj1) to obj2, thus swapping values.
	}

	public static void main(String[] args)
	{
		X x1 = new X(), x2 = new X();
		x1.i = 10;
		x2.i = 20;
		System.out.println("before calling test: " + x1.i);
		System.out.println("before calling test: " + x2.i);
		X.test(x1, x2); //x1 and x2 are supplied reference
		System.out.println("after calling test: " + x1.i);
		System.out.println("after calling test: " + x2.i);
	}
}

//in the same line we can create more than one objects using comma as a separator.

//calling(supplying), test(accepting)

//screenshot avialable.