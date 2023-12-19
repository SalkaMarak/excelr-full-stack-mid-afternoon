package app3.excelr;
class D extends C 
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println(d1.i);
	}
}

/* ---default---
within the same class- YES
withing same package direct/indirect sub class -YES (inthis case)
withing same package non sub class - yes 
*/

//D also comes under sub class of A but not immediate subclass.