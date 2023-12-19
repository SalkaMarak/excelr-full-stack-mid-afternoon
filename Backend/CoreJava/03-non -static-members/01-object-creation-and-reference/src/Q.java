class Q
{
	int i;

	static void test(Q obj) //this is accepting Q type of reference, obj can be any name.
	{
		System.out.println("from test begin: " + obj.i);
		obj.i = 20;
		System.out.println("from test end: " + obj.i);
	}
	public static void main(String[] args)
	{
		Q q1 = new Q();
		System.out.println("from main begin: " + q1.i);
		q1.i = 10;
		System.out.println("from main middle: " + q1.i);
		Q.test(q1); //q1 reference we are passing
		System.out.println("from main end: " + q1.i);
	}
}

//this means that for which object q1 is pointing, obj will also point there. (Q obj = q1).

//screenshot available 