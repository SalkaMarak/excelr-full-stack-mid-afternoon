class M 
{
	void test1()
	{
		System.out.println("from test1-M");
	}
}
class N extends M
{
	protected void test1()  //here
	{
		System.out.println("from test1-N");
	}

	public static void main(String[] args) 
	{
		N n1 = new N(); 
		n1.test1();

		System.out.println("done");
	}
}
//compared to default, protected is wider
