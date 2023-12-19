class L
{
	static int i = test();
	static
	{
		 System.out.println("SIB begin"); 
		 main(null);
		 System.out.println("SIB end"); 
	}
	static int test()
	{
		System.out.println("test begin");
		main(null);
		System.out.println("test end");
		return 20;
	}
	public static void main(String[] args)
	{
		System.out.println("main: " + i);
	}
}

/*
test begin
main 0 (i loads with default value 0)
test end
SIB begin
main 20 (i has returned with value 20)
SIB end
main 20
*/