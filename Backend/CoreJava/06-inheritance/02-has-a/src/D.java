class C
{
	int i;

	void test1()
	{
		System.out.println("C-test1()");
	}
}
class D
{
	C obj;	//first loaded with null then it gets connected
				//we are using method to create link
	void test1(C ref) //ref = c1
	{
		this.obj = ref;
	}

	void test2()
	{
		System.out.println("D-test2()");
		System.out.println(obj.i);
		obj.test1();
	}

	public static void main(String[] args) 
	{
		C c1 = new C();
		D d1 = new D();
		d1.test1(c1); 
		d1.test2(); 
		System.out.println("done");
	}
}

//we can use static, non static method and constructor to create a link, but usual way is using constructor.
//'this' is a non static keyword