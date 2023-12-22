class M10 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		//B b1 = a1; this or below line we will get error
		B b1 = new A();  //here
		System.out.println("done");
	}
}

//sub class reference cannot hold supertype of object

//Here: because we are loading A class first while creating new object and there is no B class available there.

//but forcefully we can downcast to sub-type
