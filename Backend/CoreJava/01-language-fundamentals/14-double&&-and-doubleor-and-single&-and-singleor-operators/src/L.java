class L 
{
	public static void main(String[] args) 
	{
		int i = 0;
		//single & or bitwise &
		if((i++ == 0) & (i++ == 1))
		{
			System.out.println("From if");
			i++;
		}
		System.out.println("end of main");
		System.out.println(i);
	}
}

//in case of double & if the first is false it
//wont check for second expression

//in & (single and) it checks for second 
//expression as well

//but for both, both expressions should be true







