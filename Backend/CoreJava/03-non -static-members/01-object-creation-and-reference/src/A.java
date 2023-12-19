class A 
{
	int i;   //no static before int, this is non-static or object member.
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}

/*
-non static variable = intance (object) variable.
-non static member cant be referenced from a static context without a reference variable.
-while creating the object we get the reference variable.
-by using that reference variable only we can access non staic members of that class.
*/


//we will get error here.

