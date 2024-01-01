class Q 
{
	public void test1()
	{
		System.out.println("from test1-A");
	}
}
class R extends Q
{
	public void test1()  //here
	{
		System.out.println("from test1-R");
	}

	public static void main(String[] args) 
	{
		R r1 = new R(); 
		r1.test1();

		System.out.println("done");
	}
}
//compared to default, protected is wider
//public being widest
