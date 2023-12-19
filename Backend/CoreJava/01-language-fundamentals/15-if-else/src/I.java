class I 
{
	public static void main(String[] args) 
	{
		if(true) //outer if else
		if(true)
			System.out.println("inner if"); //inner if else
		else
			System.out.println("else1"); //inner if else
		else
			System.out.println("else2"); //outer if else
	}
}

