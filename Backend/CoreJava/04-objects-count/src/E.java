class  E
{
	static int x;

	E()
	{
		x++;
	}
	E(int i)
	{
		x++;
	}
	E(int i, int j)
	{
		x++;
	}

	public static void main(String[] args) 
	{
		E e1 =new E(); 
		System.out.println("A: " + e1.x);
		E e2 =new E(10); 
		System.out.println("B: " + e2.x);
		E e3 =new E(10, 20);
		System.out.println("C: " + e3.x);
		E e4 =new E(); 
		System.out.println("D: " + e4.x);
		E e5 =new E(10); 
		System.out.println("E: " + e5.x);
		E e6 =new E(10, 20);
		System.out.println("F: " + e6.x);
		System.out.println("----------");
		System.out.println(e1.x);
		System.out.println(e2.x);
		System.out.println(e3.x);
		System.out.println(e4.x);
		System.out.println(e5.x);
		System.out.println(e6.x);	
	}
}

