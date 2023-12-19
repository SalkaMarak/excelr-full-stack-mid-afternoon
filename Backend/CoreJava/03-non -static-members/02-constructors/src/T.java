class T 
{
	T()
	{
		T(10); //in constructor we cannot call like this.
		System.out.println("T()");
	}
	T(int i)
	{
		System.out.println("T(int)");
	}
	

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		T t1 = new T(); 
		System.out.println("-----------");
		T t2 = new T(10); 
		System.out.println("-----------");
		System.out.println("main end");
	}
}

//in method we can call like that, but we have to use this() calling statement in constructor context.