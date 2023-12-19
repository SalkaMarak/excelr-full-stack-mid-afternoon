class F
{	
	public static void main(String[] args)
	{
		int i = 0;
		while(i < 5);
		{
			i++;
		}
		System.out.println(i);
	}
}

//here there is ; due to which it will go to infinite loop because while loop is ending there itself and it searches for a body but does not find any

//it doesnt get increment also and it will always keep on checking and each and other time it will be 0.


