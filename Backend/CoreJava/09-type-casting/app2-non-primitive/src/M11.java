class M11 
{
	public static void main(String[] args) 
	{
		
		A a1 = new B();			//A a1 = new A();
		B b1 = (B)a1;			//B b1 = (B)a1; 
		System.out.println("done");
	}
}

//sub class reference cannot hold supertype of object

//but forcefully we can downcast to sub-type.




//java.lang.ClassCastException: we will get error while running the commented line. because during the time of running...