class Z7
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		test(100, 120); //supplying
		System.out.println("main end");
	}
	static void test(int i, int j) //accepting
	{	
		System.out.println("before test " + i + "," + j);
		i = 1000; //reinitializing the values
		j = 1200;
		System.out.println("after test " + i + "," + j); 
	}
}



 
