class E 
{
	public static void main(String[] args) 
	{
		int i = 0;
		if((++i == 1) && (i++ == 2))
		{
			System.out.println("From if");
			i++;
		}
		System.out.println("end of main");
		System.out.println(i);
	}
}

/* while checking it checks the other expression thus
i got incremented twice */




