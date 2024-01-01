interface O
{
	void test1();
	int test2(int i);
	boolean test3(boolean b);
}
abstract class P implements O
{
	public void test1() //here
	{
		System.out.println("from test1()");
	}
	public int test2(int i) //here
	{
		System.out.println("from test2(int)");
		return 0;
	}
	
}
class Q extends P
{
	public boolean test3(boolean b) //here
	{
		return !b; //reverse of b=false
	}
	void test4()
	{
		System.out.println("from test4()");
	}

	public static void main(String[] args)
	{
		Q obj = new Q();
		obj.test1();
		obj.test2(10);
		System.out.println(obj.test3(true));
		obj.test4();
	}
}


//here: all implementation has to be done by using public access modifier.
 
 
        