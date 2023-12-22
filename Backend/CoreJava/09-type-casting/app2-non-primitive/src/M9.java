class M9 
{
	static Object test()
	{
		D d1 = new D();
		return d1; //compiler: return (Object)d1; object type but d1 is pointing to D object internally.
	}

	public static void main(String[] args) 
	{
		Object obj = test();
		System.out.println("done");
	}
}
