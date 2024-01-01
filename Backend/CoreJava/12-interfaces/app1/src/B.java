interface B
{
	int i = 10; //public static final int i = 10; by compiler.
	static int j = 10; //compiler will add public and final
	public int k = 10; //compiler will add static & final
	final int l = 10; //compiler will add static and public

	void test1();
	public void test2(); //comp will add pub & abst
	abstract void test3(); //comp will add pub
	public abstract void test4() //compiler will add pub
	abstract public void test5(); //this is as default
}

//by default whatever the variables that you are declaring are 'public', 'static', and 'final'.

//by default whatever the methods that you are declaring in the interface are 'public' and 'abstract'. There is no final here because we cannot initialize in the sub class.
