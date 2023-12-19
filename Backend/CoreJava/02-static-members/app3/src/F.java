class F
{
	static
	{
		 System.out.println(i);
	}
	static int i = 2;

	public static void main(String[] args)
	{
		System.out.println(i);
	}
}

//illegal forward reference, because i has not been declared for printing. usage is not allowed before its declaration.
//modification is possible before its declaration.