class R
{
	static
	{	
		System.out.println("R-SIB1");
	}
	public static void main(String[] args)
	{
		System.out.println("R-main");
	}
	static
	{	
		System.out.println("R-SIB2");
	}
}

/*
-static block or SIB (static initializer block)
-all the static block will be exexuted from top to bottom only once for execution before the main method.
-static block should be outside the main method or any other method but within the class.
-we can have any no of static blocks
-curly braces are mandatory.
-can be kept before or after main method
*/
