class G 
{
	void test1()
	{
		System.out.println("from test1-G");
	}
}
class H extends G
{
	void test1() //override
	{
		System.out.println("from test1-H");
	}

	public static void main(String[] args) 
	{
		G g1 = new H(); //H class is upcasted to G class
		g1.test1();

		G g2 = new G(); 
		g2.test1();
		System.out.println("done");
	}
}

//OBJECT CREATION MATTERS what the output will be.