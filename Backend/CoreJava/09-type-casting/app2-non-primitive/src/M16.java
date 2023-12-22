class M16 
{
	static C test() //but test is having C type so we need to upcast
	{
		A a1 = new D();
		return a1;
	}
		
	public static void main(String[] args) 
	{
		D d1 = test(); //so we need to downcast C type to D type shown in next class M17
		System.out.println("done");
	}
}

//ERROR HERE: a1 cannot be casted to c 