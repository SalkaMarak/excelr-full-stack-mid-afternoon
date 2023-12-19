class W
{
	W(int i)
	{
		System.out.println("W(int)");
	}
}
class X extends W
{
	X()
	{
		//super(); by default
		System.out.println("X()");

	}
}

//we will get error here because class X will be having super() by default inside its no arg constructor calling the parent no arg constructor which isnt there.