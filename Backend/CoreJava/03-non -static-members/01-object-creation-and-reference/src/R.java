class R
{
	int i;

	public static void main(String[] args)
	{
		R r1 = new R();
		System.out.println("main log1: " + r1.i);
		r1.i = 10;
		System.out.println("main log2: " + r1.i);
		R r2 = r1; //creating new reference thats = to r1
		r2.i = 20;
		System.out.println("main log3: " + r2.i);
		R r3 = r2; //creating new reference thats = to r2
		r3.i = 30;
		System.out.println("main log4: " + r3.i);
		System.out.println("---------------------");
		System.out.println("main log final: " + r1.i + ", " + r2.i + ", " + r3.i);
	}
}

//ALL THE REFERENCES ARE POINTING TO THE SAME OBJECT(theres only one object created)

/*
0
10
20
30
30,30,30
*/