class N 
{
	public void test()
	{
		System.out.println("from L test()");
	}

}
class O extends N
{
	public static void test(int i)
	{
		super.test();
		System.out.println("from M test(int)");
	}
	public static void main(String[] args) 
	{
		O obj = new O();
		obj.test();				
		obj.test(10);			
		System.out.println("done");
	}
}

//error: non-static variable super cannot be referenced from a static context