package app4.rst;
import app4.excelr.A;
class F 
{
	public static void main(String[] args)
	{
		A a1 = new A();
		//System.out.println(a1.i); //default -NO
		//System.out.println(a1.j); //protected -NO
		System.out.println(a1.k); //public -YES
	}
}

//outside the package only subclass can access protected.

