interface K
{
	void test1();
}
class L implements K
{
	public void test1() //overriding test1 in K interface
	{
		System.out.println("from L.test1()");
	}
	public static void main(String[] args)
	{
		//K obj = new K; we cannot create an object for an interface
		K obj1 = null; //but we can create a reference
		K obj2 = new L(); //superclass ref subclss object
		obj2.test1();
		System.out.println("done");
	}
}

 
        