class H 
{
	public static void main(String[] args) 
	{
		if(true)
		{
			System.out.println("from if");
			if(true)
			{
				System.out.println("inner if");
				if(true)
				{
					System.out.println("inner if");
					if(true)
					{
						System.out.println("inner if");
					}
				}		
			}
		
		}
		System.out.println("from main");
	}
}

//nested if