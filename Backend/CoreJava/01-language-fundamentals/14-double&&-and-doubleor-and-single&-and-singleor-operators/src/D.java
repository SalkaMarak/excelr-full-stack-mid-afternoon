class D 
{
	public static void main(String[] args) 
	{
		int i = 0;
		if((i++ == 1) && (i++ == 1))
		{
			System.out.println("From if");
			i++;
		}
		System.out.println("end of main");
		System.out.println(i);
	}
}

/* in first expression only its false so the operation
does not continue thus i only gets incremented only
once */



