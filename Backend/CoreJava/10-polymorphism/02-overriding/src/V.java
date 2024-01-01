class U 
{
	static public void test1()
	{
		System.out.println("from test1-U");
	}
}
class V extends U
{
	static public void test1()  
	{
		System.out.println("from test1-V");
	}

	public static void main(String[] args) 
	{
		V v1 = new V(); 
		v1.test1();

		System.out.println("done");
	}
}
//in static context
