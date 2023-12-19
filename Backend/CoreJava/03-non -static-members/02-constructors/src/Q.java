class Q 
{
	Q()
	{
		this(true);
		System.out.println("Q()");
	}
	Q(int i)
	{
		System.out.println("Q(int)");
	}
	Q(boolean b)
	{
		System.out.println("Q(boolean)");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Q q1 = new Q(); 
		System.out.println("-----------");
		Q q2 = new Q(10); 
		System.out.println("-----------");
		System.out.println("main end");
	}
}
