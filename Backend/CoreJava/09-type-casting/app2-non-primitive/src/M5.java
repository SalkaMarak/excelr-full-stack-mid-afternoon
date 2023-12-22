class M5 
{
	public static void main(String[] args) 
	{
		Object obj = new A(); // Obj = (Object) new A();
		A a1 = new B(); //a1 = (A) new B(); -b is being upcasted to A.
		B b1 = new C();
		C c1 = new D();
		System.out.println("done");
	}
}

//if in the left-hand side Supertype and in the right-hand side Sub type auto upasting will happen. Compiler only does type promotion from sub to super type.

//object is the supermost class