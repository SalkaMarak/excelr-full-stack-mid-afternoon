class  D
{
	static int x;

	D()
	{
		x++;
	}

	public static void main(String[] args) 
	{
		D d1 =new D();
		System.out.println("A: " + d1.x);
		D d2 =new D();
		System.out.println("B: " + d2.x);
		D d3 =new D();
		System.out.println("C: " + d3.x);
		D d4 =new D();
		System.out.println("D: " + d4.x);
		D d5 =new D();
		System.out.println("E: " + d5.x);
		System.out.println("------------");
		System.out.println("#: " + d1.x);
		System.out.println("#: " + d2.x);
		System.out.println("#: " + d3.x);
		System.out.println("#: " + d4.x);
		System.out.println("#: " + d5.x);

	}
}

//output: 1 2 3 4 5 --- 5 5 5 5 5
//unlike in class C: 1 1 1 1 1
//this is because static int x gets loaded ONLY ONCE and when a new object is created the same x is used.
//here we are making modification to the same static variable in all the objects.
//by using any of the reference we can access this static member (x).
