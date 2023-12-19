class C 
{
	public static void main(String[] args) 
	{
		int i; //local variable (local to main method)
		i= 10;
		System.out.println(i);
		i = 20; //reinitialization
		System.out.println(i);
		i = 30;
		System.out.println(i);
		System.out.println(i);
	}
}

//The same variable can be reinitialized any no of times
//local variables cant be acesed outside of the declaired blocks
//scope of the local variables(visibility) limited to that declared blocks only.

