class U 
{
	U()
	{
		this(10); 
		System.out.println("U()");
	}
	U(int i)
	{
		this();
		System.out.println("U(int)");
	}
	

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		U u1 = new U(); 
		System.out.println("-----------");
		U u2 = new U(10); 
		System.out.println("-----------");
		System.out.println("main end");
	}
}

//ERROR: recursive constructor invocation. They will keep calling each other and get stuck in a loop.