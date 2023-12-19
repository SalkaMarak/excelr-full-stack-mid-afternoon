class  A
{
	static int x;

	A()
	{
		x += 10;
	}
	{
		x += 20;
	}
	void test1()
	{
		x += 30;
	}
	static void test2()
	{
		x += 40;
	}
		
	public static void main(String[] args) 
	{
		System.out.println("A: " + x);
		A a1 = new A();
		System.out.println("B: " + x);
		a1.test1(); 
		System.out.println("C: " + x);
		a1.test2(); //here
		System.out.println("D: " + x);
	}
}

//static members can be accessed within a static as well as non static context.

//here: all the static members of a class are part of each and every object, (so here we are calling static test 2 with a1 reference, at the time of compilation this a1 will be replaced with class reference A),
//All the static members of a class belong to each and every objects of a class.
//by using any of the object ref we can access any of the object ref.