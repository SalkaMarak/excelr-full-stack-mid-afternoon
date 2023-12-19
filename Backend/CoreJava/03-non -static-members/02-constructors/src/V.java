class V 
{
	V()
	{
		this(); 
		System.out.println("V()");
	}
}

//error: recursive constructor invocation. Constructor calling itself and will be stuck in a loop.