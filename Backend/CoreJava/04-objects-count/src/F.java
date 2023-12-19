class  F
{
	static int x;

	F()
	{
		x++;
	}
	F(int i)
	{
		x++;
	}
	F(int i, int j)
	{
		x++;
	}
	//IIB1
	{
		x++;
	}
	//IIB2
	{
		x++;
	}

	public static void main(String[] args) 
	{
		F f1 =new F(); 
		F f2 =new F(10); 
		F f3 =new F(10, 20); 
		F f4 =new F(); 
		F f5 =new F(10); 
		F f6 =new F(10, 20);
		System.out.println("A: " + f1.x);
		System.out.println("B: " + f2.x);
		System.out.println("C: " + f3.x);
		System.out.println("D: " + f4.x);
		System.out.println("F: " + f5.x);
		System.out.println("F: " + f6.x);
	}
}

//18 18 18 18 18 18