class P 
{
	static int i;
	boolean k;

	static public void test()
	{
		System.out.println("from P test()");
	}

}
class Q extends P
{
	{
		super.test(); //iib
	}

	public void test(int i)
	{
		super.test();
		System.out.println("from Q test(int)");
		System.out.println(super.i);
		System.out.println(super.k);
	}
	public static void main(String[] args) 
	{
		Q obj = new Q();
		obj.test();				
		obj.test(10);			
		System.out.println("done");
	}
}
//we can only call from non-static because when we create an object static superclass method is already loaded in the memory so we can access.

//while when we try to call from static method, we are not creating an object.

//super calling belongs to non-static context.

//we cannot call from static because static belongs to class and NOT object.