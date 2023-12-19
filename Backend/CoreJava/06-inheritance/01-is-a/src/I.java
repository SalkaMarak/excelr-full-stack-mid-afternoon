class G 
{
	void test1()
	{
		System.out.println("from test1()");
	}
}
class H extends G
{
	void test2()
	{
		System.out.println("from test2()");
	}
}
class I extends H
{
	void test3()
	{
		System.out.println("from test3()");
	}

	public static void main(String[] args)
	{
		I obj = new I();
		obj.test1();
		obj.test3();
		obj.test3();
	}
} 

//last class will be having all the properties of parent classes

//multi level


