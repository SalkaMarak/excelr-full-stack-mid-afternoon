class S
{
	int i;
	static void test(S obj) //this
	{
		obj.i = 20;
	}
	public static void main(String[] args)
	{
		S s1 = new S();
		s1.i = 10;
		System.out.println("before calling test(S): " + s1.i);
		S.test(s1); //here
		System.out.println("after calling test(S): " + s1.i);
	}
}

//this- simply means that we are creating a new reference called obj that points to the S object. S s1 = obj.

//OUTPUT: before calling: 10, after calling 20.

/*
here
-call by reference or pass by reference.
-changes in the destination would reflect to the source.
-its like we are sending the key to the object itself by supplying the reference.
-if we are sending a reference that would be a 100% chance to modift the objects data member.
*/