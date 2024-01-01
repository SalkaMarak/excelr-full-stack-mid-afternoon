class W 
{
	static public void test1()
	{
		System.out.println("from test1-W");
	}
}
class X extends W
{
	static public void test1()  
	{
		System.out.println("from test1-X");
	}

	public static void main(String[] args) 
	{
		W w1 = new X(); //subtype ref supertype obj
		w1.test1();

		System.out.println("done");
	}
}
//in static context: we get from which class reference we call. [[REFERENCE MATTERS]]

