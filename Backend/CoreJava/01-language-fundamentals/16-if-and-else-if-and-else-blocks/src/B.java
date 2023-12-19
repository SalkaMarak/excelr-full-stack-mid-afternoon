class B 
{
	public static void main(String[] args) 
	{
		if(false)
		{
			System.out.println("From if");
		}
		else if(false)
		{
			System.out.println("from else if");
		}
		else
		{
			System.out.println("from last else");
		}
		else if(false)
		{
		}
		{
			System.out.println("from else if 2");
		}
	
	}
}

//we will get compilation error here as we cannot use else if after else block