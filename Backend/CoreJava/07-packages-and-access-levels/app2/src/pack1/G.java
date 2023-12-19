package pack1;
class F
{
	private F()
	{
		System.out.println("F()"); 
	}
}

class G extends F
{
	/* BY DEFAULT
	G()
	{ 
		super90;
	}
	*/
}

//error since there will be a default no arg constructor and inside there will be super() which wont be able to access since its private 