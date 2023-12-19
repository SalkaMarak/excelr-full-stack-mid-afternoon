class A 
{
	A()
	{
		System.out.println("A()");
	}

	{
		System.out.println("IIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A a1 = new A();
		System.out.println("-----------");
		A a2 = new A();
		System.out.println("main end");
	}
}

/* ----------------IIB---------------
-instance initialization/initializer block.
-if there is a common implementation for all the ovjects then we can keep that inside the IIB block.
-all the IIB blocks gets executed from top to bottom for one object creation before the execution of constructor only once.
*/

/*OUTPUT:
main begin
IIB
A()
-----------
IIB
A()
main end
*/
