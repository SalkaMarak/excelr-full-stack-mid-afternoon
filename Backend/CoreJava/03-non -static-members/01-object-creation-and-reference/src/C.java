class C 
{
	void test()  //non static method
	{
	}
	public static void main(String[] args) 
	{
		test();
		System.out.println("done");
	}
}


//ERROR: non-static method test() cannot be referenced from a static context

//to access we have to create an object,and get a reference.