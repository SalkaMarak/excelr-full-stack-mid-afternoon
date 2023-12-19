class L 
{
	L(int i)
	{
		System.out.println("L(int): " + i);
	}
	L(boolean b)
	{
		System.out.println("L(boolean): " + b);
	}
	public static void main(String[] args) 
	{
		L l1 = new L(10);
		System.out.println("-------------");
		L l2 = new L(true);
		System.out.println("-------------");
	}
}
