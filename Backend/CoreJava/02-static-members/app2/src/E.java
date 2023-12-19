class E
{
	static int i = test();
	static int j = 10;
	static int test()
	{
		return j;
	}
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}

//i is 0 here because before j initialization it is loaded with the default value 0 while considering as an int field. ie before declaration j in the next line.