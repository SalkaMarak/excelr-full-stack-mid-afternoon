class M14 
{
	public static void main(String[] args) 
	{
		
		A a1 = new D();			
		D d1 = (D)a1;			
		System.out.println("done");
	}
}

//no exception here because a1 is pointing upto D class, while loading so theres class D available, so in runtime we can downcast A into D.
