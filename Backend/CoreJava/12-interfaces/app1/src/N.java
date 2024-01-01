interface M
{
	void test1();
	int test2(int i);
}
class N implements M
{
	public void test1() 
	{
		System.out.println("from test1()");
	}
	public int test2(int i) 
	{
		System.out.println("from test2(int)");
		return 0;
	}

	public static void main(String[] args)
	{
		N obj = new N();
		obj.test1();
		obj.test2(10);
		System.out.println("done");
	}
}

/*while implementating interface methods in the subclass.
- access specifier - 'public' and nothing else
-by default only they are public and abstract. */
 
 
        