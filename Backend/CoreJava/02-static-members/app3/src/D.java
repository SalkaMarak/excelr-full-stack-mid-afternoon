class D
{
	static int i = 1;
	static
	{
		i = 2;
	}
	public static void main(String[] args)
	{
		System.out.println(i);
	}
}

//in static block we can reinitialize