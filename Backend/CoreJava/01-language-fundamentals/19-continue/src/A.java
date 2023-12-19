class A  
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Loop begin");
			if(i > 5)
			{
				continue;
			}
			System.out.println("Loop end");
		}
		System.out.println("main end");
	}
}

//without executing the next statemnt of the forloop it will skip to the next iteration of the forloop ie i++ 