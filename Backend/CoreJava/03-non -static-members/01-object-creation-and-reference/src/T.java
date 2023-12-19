class T
{
	int i;

	static void test(int i)
	{
		i = 20;
	}
	public static void main(String[] args)
	{
		T t1 = new T();
		t1.i = 10;
		System.out.println("before calling test(int): " + t1.i);
		T.test(t1.i); //call by value or pass by value
		System.out.println("after calling test(int): " + t1.i);
	}
}

//before 10, after 10
//because we are sending t1.i (value) not t1 itself(reference), so there cant be modification in the object.

/*call by value or pass by value
-changes in the destination, would not be reflecting to the source.
-we are not sending the reference instead just the value, in this case there is no chance of modification to the object.
*/

