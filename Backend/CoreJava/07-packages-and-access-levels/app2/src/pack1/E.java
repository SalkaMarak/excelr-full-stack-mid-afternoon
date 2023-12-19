package pack1;
class D
{
	private void test1()
	{
		System.out.print("from D.test1()");
	}
	void test2()  //default
	{
		System.out.println("from D.test2()");
	}
}

class E extends D

{
	public static void main(String[] args) 
	{
		E obj = new E(); 
		//obj.test1(); -with this we will get error
		obj.test2();
		System.out.println("done"); 	
	}
}

/*default ==> friendly ==> package level
same class-yes
same package sub clas -yes
same package non sub class-yes
OUTSIDE PACKAGE - NO
*/

