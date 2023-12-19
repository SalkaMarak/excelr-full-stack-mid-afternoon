class M 
{
	M()
	{
		//this will also have super(), compiler keeps this by default. calls object class no arg constructor.
		System.out.println("M()");
	}
}
class N extends M
{
	N()
	{
		//super(), compiler keeps this by default. calls parent class no arg constructor. we can also keep by ourselves. and it must be the first statement
		super();
		//then IIB
		System.out.println("N()");
	}
	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println("done");
	}
}

/*
- In java object class is the supermost class
- each class whether directly (here M class) or indirectly (N class) extends object class.
- In the object we have many members which are required by all the classes in Java(user or inbuild). All those members will be inherited to all the classes by default.
*/