class M 
{
	static int i = 100;
	public static void main(String[] args) 
	{
		System.out.println("a: " + i);
		int i = 10;
		System.out.println("b: " + M.i);
		//i = 20;
		System.out.println("c: " + i);
		
	}
}


//if global and local variables are with the same name then local variable will be given the preference.

//100 100 10, we got b's i using class reference.
