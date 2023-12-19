class P 
{
	int i;
	int j;
	static int k;

	public static void main(String[] args)
	{
		int i = 100;
		System.out.println(i); //100 from above local
		System.out.println(j); //cannot accesss
		System.out.println(k); //we can print directly

		P p1 = new P();
		System.out.println(p1.i); //non static i=0
		P p2 = new P(); //new object being called w/ o2 ref.
		System.out.println(o2.i);
		p1.i = 10;
		p2.i = 20;
		System.out.println(p1.i);
		System.out.println(p2.i);
	}
}

//no connection betw static local and global non static bc in non static we need to access it using reference object.