class U 
{
	static int i;
	static int j = i = 10; //compound assignment
	public static void main(String[] args) 
	{
		System.out.println("value of i: " + i);
		System.out.println("value of j: " + j);	
	}
}




