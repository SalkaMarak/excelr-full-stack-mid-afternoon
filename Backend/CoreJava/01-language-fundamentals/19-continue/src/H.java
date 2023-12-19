class H  
{
	public static void main(String[] args) 
	{	
		for(int i = 1; i <= 5; i++)
			{
				System.out.println(i);
				if (i >= 3)
				{
					continue;
					continue;
				}
				System.out.println(i);
			}
	}
}

//without executing the next statemnt of the forloop it will skip to the next iteration of the forloop ie i++ 
//we can only have one continue statement
