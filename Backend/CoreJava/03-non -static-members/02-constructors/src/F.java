class F 
{
	int i; //attribute/field

	F()
	{
		System.out.println("F()");
		i = 10;
	}

	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println(f1.i);
	}
}
//Q.what is the need of constructors?
//constructors are used to initialized objects.

//non static members can be used without any reference variable in the nonstatic context.