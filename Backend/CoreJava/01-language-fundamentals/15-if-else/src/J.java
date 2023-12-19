class J 
{
	public static void main(String[] args) 
	{
		if(false) //outer if else
		if(true)
			System.out.println("inner if"); //inner ifelse
		else
			System.out.println("else1"); //inner if else
		else
			System.out.println("else2"); //outer if else
	}
}

//since outer is false therefore the inner will completely not be executed

