class F  
{
	public static void main(String[] args) 
	{	
		for(int i = 0; i < 10; i++)
			{
				System.out.println(i);
				continue;
				System.out.println(i);
			}
	}
}

//without executing the next statemnt of the forloop it will skip to the next iteration of the forloop ie i++ 
