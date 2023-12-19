class V
{
	int i;

	static V test()
	{
		return new V(); //here
	}

	public static void main(String[] args)
	{
		V v1 = test();
		System.out.println(v1.i);
	}
}

//while returning we can create an object.
//either we can return a reference or an object of that class.