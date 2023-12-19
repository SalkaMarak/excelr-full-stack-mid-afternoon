class Z8
{
	Z8(int i)
	{
	}
}
class Z9 extends Z8 
{
	Z9()
	{
		super(10);
	}
	Z9(int i)
	{
		//super() by default
	}
}

//we will get error here since all the constructors will always have super() as default.

