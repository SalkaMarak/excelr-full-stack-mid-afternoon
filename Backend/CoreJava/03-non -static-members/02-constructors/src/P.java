class P 
{
	P() //no arg consructor
	{
		System.out.println("P()");
	}
	P(int i) //arg const
	{
		this(); //here
		System.out.println("P(int)");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		P p1 = new P(); 
		System.out.println("-----------");
		P p2 = new P(10); 
		System.out.println("-----------");
		System.out.println("main end");
	}
}

/*
---------------'this' calling statement:-----------------
-this is a keyword.
-can use this() inside a constructors body or inside a method.
-this() calling statement is used to call the current class constructors, if it is used within a constructor.

-here when this() is provided, no arg constructor will be called.