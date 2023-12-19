class I
{
	static int i;
	static
	{
		 i = j; //comes under usage, j before declaration
	}
	static int j = 40;
	public static void main(String[] args)
	{
		System.out.println(i);
		System.out.println(j);
	}
}

//illegal forward reference error
