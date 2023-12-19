class C 
{
	public static void main(String[] args) 
	{
		if(false)
		{
			System.out.println("From if");
		}
		System.out.println("some statement");
		else if(false)
		{
			System.out.println("from else if");
		}
		
		else if(false)
		{
			System.out.println("from else if 2");
		}
		else
		{
			System.out.println("from last else");
		}
	
	}
}

//we will get error here as well as we cannot break the contuinity between if and else if/else statements.