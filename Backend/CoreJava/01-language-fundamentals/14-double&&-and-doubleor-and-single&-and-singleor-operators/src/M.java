class M 
{
	public static void main(String[] args) 
	{
		int i = 0;
		//single | or bitwise | (OR)
		if((i++ == 0) | (i++ == 0))
		{
			System.out.println("From if");
			i++;
		}
		System.out.println("end of main");
		System.out.println(i);
	}
}

//in case of double | if the first is true it wont check for second expression

//in & (single or) it checks for second expression as well

//but for both, one expressions should be true







