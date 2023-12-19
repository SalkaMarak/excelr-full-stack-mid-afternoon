class B 
{
	public static void main(String[] args) 
	{
		int i = 3;
		switch(i) 
		{
			case 2:
				System.out.println("from case 2");
			case 3:
				System.out.println("from case 3");
			case 5:
				System.out.println("from case 5");
		}
	}
}

//switch is one of the key/reserved word. It is different from all the other loop. It is a condition not a loop. 
//we can develop any number of cases within the context of switch. 

//here we get from case 3 and case 5: because since there is no restriction so there is flow to next case as well whiich is case 5.
