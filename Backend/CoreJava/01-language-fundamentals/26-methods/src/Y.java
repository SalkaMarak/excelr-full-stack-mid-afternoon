class Y
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		int i = test();
		System.out.println(i);
		System.out.println("main end");
	}
	static int test()
	{	
		System.out.println("from test");
		return 100;
	}
}

//when the method is called in an SOP statement it first executes the method then print the value.

/*
main begin
from test
100 
main end
*/







