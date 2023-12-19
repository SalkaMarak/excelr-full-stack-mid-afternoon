class F 
{
	int i;
	static //static block is also a static member
	{
		System.out.println(i);
	}
}

//ERROR: non-static variable i cannot be referenced from a static context. w/o a reference variable.