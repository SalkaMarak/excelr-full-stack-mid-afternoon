class L 
{
	public void test()
	{
		System.out.println("from L test()");
	}

}
class M extends L
{
	public void test(int i)
	{
		super.test();
		System.out.println("from M test(int)");
	}
	public static void main(String[] args) 
	{
		M obj = new M();
		obj.test();				
		obj.test(10);			
		System.out.println("done");
	}
}

//Q. Can we call superclass method by using super(), like in constructors?
//A. yes by using super calling statement followed by the method name. super.test();