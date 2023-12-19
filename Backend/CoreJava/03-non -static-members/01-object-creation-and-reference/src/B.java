class B 
{
	int i;
	public static void main(String[] args) 
	{
		System.out.println(B.i);
	}
}


 //we will still get error saying, non-static variable i cannot be referenced from a static context.
 
 /*
 static members are class members.
non-static members are object members. we have to create a reference object to access it.

while class is loaded object members are not loaded but is loaded when we create an object for that particular class.
*/