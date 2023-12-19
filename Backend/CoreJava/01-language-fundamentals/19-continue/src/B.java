class B  
{
	public static void main(String[] args) 
	{	
		int i;
		for (i = 0; i < 10; i++)
		{
			System.out.println("Loop begin: " + i);
			if(i > 5)
			{
				continue;
			}
			System.out.println("Loop end: " + i);
		}
		System.out.println("main end: " + i);
	}
}

//without executing the next statemnt of the forloop it will skip to the next iteration of the forloop ie i++ 