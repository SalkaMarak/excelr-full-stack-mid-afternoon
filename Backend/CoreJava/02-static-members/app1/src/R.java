class R 
{
	static int i= 10;
	public static void main(String[] args) 
	{
		System.out.println(i);
		double i = 2.9;
		i = 40.0;
		System.out.println(i);
		System.out.println(R.i);	
	}
}

/*
10
40.0
10

doesnt matter the data type, with the same name, local one will get the preference. so we have to use class reference.
*/


