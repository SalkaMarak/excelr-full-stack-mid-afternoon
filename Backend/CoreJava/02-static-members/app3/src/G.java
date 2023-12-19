class G
{
	static
	{
		 System.out.println(i = 10); 
		 //since here we are modifying and then using it so it prints. no illegal forward ref error.
	}
	static int i = 2;
	public static void main(String[] args)
	{
		System.out.println(i);
	}
}

//usage is not allowed before its declaration.
//modification is possible before its declaration.
