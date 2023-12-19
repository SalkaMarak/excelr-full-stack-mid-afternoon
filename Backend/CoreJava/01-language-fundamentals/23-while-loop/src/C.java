class C
{	
	public static void main(String[] args)
	{
		int i = 0;
		while((i = 2) < 5)
		{
			System.out.println(i);
			i++;
		}
	}
}

/*here everytime i will be reinitialized as 2 so it will be an infinite loop */

