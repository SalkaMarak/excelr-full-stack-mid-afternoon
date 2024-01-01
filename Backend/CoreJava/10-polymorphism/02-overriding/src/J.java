class I 
{
	void test1()
	{
		System.out.println("from test1-I");
	}
}
class J extends I
{
	int test1() 
	{
		System.out.println("from test1-J");
		return 10;
	}

	public static void main(String[] args) 
	{
		J j1 = new J(); 
		j1.test1();

		System.out.println("done");
	}
}

/* error: test1() in J cannot override test1() in I
        int test1()
            ^
  return type int is not compatible with void */

  //FOR OVERRIDING, METHOD NAME AS WELL AS RETURN TYPE HAS TO BE SAME 