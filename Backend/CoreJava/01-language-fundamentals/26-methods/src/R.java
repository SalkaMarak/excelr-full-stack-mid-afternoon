class R
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
	static String test()
	{	
		System.out.println("from test");
		return "abc";
	}
}

//we have to return any int return value here, since it is not void. 

//if the return statement isnt void then return statement with corresponding value is mandatory. eg: int must have some int value like return 12; or return 100;





