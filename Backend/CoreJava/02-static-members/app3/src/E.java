class E
{
	static
	{
		i = 1; 
	}
	static int i = 2;
	public static void main(String[] args)
	{
		System.out.println(i);
	}
}

//output 2
//static members gets loaded and executed top to bottom. first i gets loaded with default value 0 and then gets its value from initialzation.