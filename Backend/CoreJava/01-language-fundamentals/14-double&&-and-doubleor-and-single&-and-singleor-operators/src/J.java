class J 
{
	public static void main(String[] args) 
	{
		int i = 0;
		if((++i == 0) || (i++ == 2))
		{
			System.out.println("From if");
			i++;
		}
		System.out.println("end of main");
		System.out.println(i);
	}
}








