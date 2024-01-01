class S 
{
	private void test1()
	{
		System.out.println("from test1-S");
	}
}
class T extends S
{
	private void test1()  //here
	{
		System.out.println("from test1-T");
	}

	public static void main(String[] args) 
	{
		T t1 = new T(); 
		t1.test1();

		System.out.println("done");
	}
}
//we can go both private
//then default--> private
