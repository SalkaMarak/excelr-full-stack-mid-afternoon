class M19 
{
	public static void main(String[] args) 
	{
		A a1 = new B(); 
		System.out.println(a1 instanceof A);
		System.out.println(a1 instanceof B);
		System.out.println(a1 instanceof C);
		System.out.println(a1 instanceof D);
	}
}

//OUTPUT: TRUE TRUE FALSE FALSE


/* HOW TO AVOID THIS EXCEPTION?
we can take a suggestion from the instanceof operator to avoid the ClassCastExceotion
*/