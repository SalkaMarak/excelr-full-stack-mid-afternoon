class Y 
{
	void test1()
	{
		System.out.println("from test1-Y");
	}
}
class Z extends Y
{
	void test1()  
	{
		System.out.println("from test1-Z");
	}

	public static void main(String[] args) 
	{
		Z z1 = (Z) new Y(); //subtype obj supertype ref
		z1.test1();

		System.out.println("done");
	}
}
/* 
error: incompatible types: Y cannot be converted to Z
                Z z1 = new Y(); //subtype obj supertype ref
                       ^			

but if we downcast forcefully by adding (Z) then Exception in thread "main" java.lang.ClassCastException: Y cannot be cast to Z
        at Z.main(Z.java:17) 

POINT IS: for non-static methods overriding, if the reference is supertype we have two options:
1. supply super-type of object only.
2. supply sub-class of object.
*/

