class E 
{
	E()
	{
		System.out.println("E()");

	}

	public static void main(String[] args) 
	{
		System.out.println("mein begin");
		E e1 = new E(); 
		E e2 = new E();
		System.out.println("main end");		
	}
}
//while creating an object the constructors are executed, 2 times in this case.