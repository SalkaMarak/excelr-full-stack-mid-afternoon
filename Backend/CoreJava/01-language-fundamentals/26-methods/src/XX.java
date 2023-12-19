class XX
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		System.out.println(test() + 100);
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
200
main end
*/

//test method is called two times here, and the two 100s will be added to give 200 as sum because of + operation in the SOP.






