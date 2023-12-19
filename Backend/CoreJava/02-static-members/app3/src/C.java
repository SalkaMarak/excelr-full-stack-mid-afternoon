class C
{
	static int i; //first it will load with zero
	static
	{
		i = 10; //then it initializes to 10
	}
	public static void main(String[] args)
	{
		System.out.println(i);
	}
}
