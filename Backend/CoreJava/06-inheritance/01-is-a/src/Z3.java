class Z2
{

}
class Z3 extends Z2 
{
	Z3(int i)
	{
		super(20);
		System.out.println("Z(int)");
	}
}

//we will get error here because there is no parent constructor with int as an arguement.