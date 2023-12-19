class I 
{
	I()
	{
		System.out.println("I()");
	}

	public static void main(String[] args) 
	{
		I i1 = new I(10);
		System.out.println("done");
	}
}

//error since there is no arguement constructor in the class I.
// required: no arguments , found: int
//since we are passing 10 value