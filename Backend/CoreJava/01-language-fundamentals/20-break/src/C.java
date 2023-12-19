class C 
{
	public static void main(String[] args) 
	{
		int i;
		for(i = 0; i < 10; i++)
		{
			System.out.println("Loop begin: " + i);
			if (i > 5)
			{	
				break;
				System.out.println("Some Statement");
			}
			System.out.println("loop end: " + i);
		}
		System.out.println("main end: " + i);
	}
}

//in case of break when the condition becomes true it breaks the entire for loop. Continue skips to the next itteration.
//just like continue break also has to be last statement in the current block
