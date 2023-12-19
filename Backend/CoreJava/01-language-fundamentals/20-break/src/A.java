class A 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Loop begin");
			if (i > 5)
			{	
				break;
			}
			System.out.println("loop end");
		}
		System.out.println("main end");
	}
}

//in case of break when the condition becomes true it breaks the entire for loop. Continue skips to the next itteration.
