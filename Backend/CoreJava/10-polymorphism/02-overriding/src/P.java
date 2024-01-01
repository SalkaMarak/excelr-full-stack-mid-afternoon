class O 
{
	void test1()
	{
		System.out.println("from test1-A");
	}
}
class P extends O
{
	public void test1()  //here
	{
		System.out.println("from test1-P");
	}

	public static void main(String[] args) 
	{
		P p1 = new P(); 
		p1.test1();

		System.out.println("done");
	}
}
//compared to default, protected is wider
//public being widest
