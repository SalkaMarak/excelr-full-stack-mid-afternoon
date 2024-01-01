abstract class U
{
	U(int i)
	{
		System.out.println("U(int i)");
	}
	abstract void test1(); //this gets implemnted in class W
}

abstract class V extends U
{
	V()
	{
		super(40);
		System.out.println("V()");
	}
}

class W extends V
{
	W()
	{
		//super(); by default.
		System.out.println("W()");
	}
	void test1()
	{
		System.out.println("From test1()");
	}
	public static void main(String[] args)
	{
		W obj = new W();
		System.out.println("--------------");
		obj.test1();
		System.out.println("done");
	}
}

