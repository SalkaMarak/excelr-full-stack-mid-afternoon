class D 
{
	static int i;
	static double j;
	public static void main(String[] args) 
	{
		System.out.println("before i: " + i);
		System.out.println("before j: " + j);
		int i = 10;
		int j = 20;
		System.out.println("after i: " + i);
		System.out.println("after j: " + j);

	}
}

//we can reinitialize static variables any no of times in the main method or ant other methods as well.


