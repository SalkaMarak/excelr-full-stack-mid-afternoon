class A 
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

//if if block fails the else if block is ececuted next in sequential manner before else block.
//for one if block we can develop any no of else if blocks