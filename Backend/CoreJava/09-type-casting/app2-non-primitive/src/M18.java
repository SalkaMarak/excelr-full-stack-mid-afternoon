class M18 
{
	public static void main(String[] args) 
	{
		A a1 = new B(); 
		System.out.println(11);
		B b1 = (B)a1; 
		System.out.println(22);
		C c1 = (C)a1;
		System.out.println(33);

	}
}

//OUTPUT: 11 22 exception
//because A is pointing only upto B

/* HOW TO AVOID THIS EXCEPTION?
-
-
-
*/