package app2.pack1;
class L
{
	private L()
	{
		System.out.println("L()"); 
	}
	L(int i)
	{
		System.out.println("L(int)"); 
	}
}

class M extends L
{
	M()
	{
		super(10); //to remove the default calling we just replace it.
		System.out.println("M()");
	}
	public static void main(String[] args)
	{
		M obj2 = new M();
	}
}

