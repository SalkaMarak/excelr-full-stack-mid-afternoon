class P 
{
	public static void main(String[] args) 
	{	
		boolean flag = true;
		if((flag = false) == false)
		{
			System.out.println("From if");
		}
		System.out.println("end of main: " + flag);
	}
}


