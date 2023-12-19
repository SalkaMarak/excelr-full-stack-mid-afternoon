class E  
{
	public static void main(String[] args) 
	{	
		for(int i = 0; i < 10; i++)
			{
				System.out.println(i);
				continue;
			}
	}
}

//without executing the next statemnt of the forloop it will skip to the next iteration of the forloop ie i++ 
//here we are not giving a condition to continue but it is syntatically corrent so it will run.
