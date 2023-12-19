package app4.rst;
import app4.excelr.*;
class J extends I
{
	public static void main(String[] args)
	{
		J j1 = new J();
		//System.out.println(j1.i); //default
		System.out.println(j1.j); //protected 
		System.out.println(j1.k); //public 
	}
}


//to which class(eg H) protected class are inheriting, to access the protected members we have to create an object for that class(H).