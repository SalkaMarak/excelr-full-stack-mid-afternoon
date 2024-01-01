class K 
{
	void test1()
	{
		System.out.println("from test1-K");
	}
}
class L extends K
{
	private void test1()  //here
	{
		System.out.println("from test1-L");
	}

	public static void main(String[] args) 
	{
		L l1 = new L(); 
		l1.test1();

		System.out.println("done");
	}
}

/* error: test1() in L cannot override test1() in K
        private void test1()
                     ^
  attempting to assign weaker access privileges; was package */