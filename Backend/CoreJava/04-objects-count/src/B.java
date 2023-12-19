class  B
{
	static int x = 10;

	public static void main(String[] args) 
	{
		System.out.println("A: " + x);
		System.out.println("B: " + B.x); //same thing as above as in static context we dont necessarily need a class ref.
		
		B b1 = new B();
		B b2 = new B();

		System.out.println("C: " + b1.x);
		System.out.println("D: " + b2.x);
	}
}

//for B b1 object the static variable (static int x) also becomes a member. It is not loaded again it goes in the object as it is.