class X 
{
	static int i;
	static int k = i;
	static int j = k;
	static int l = l; //we will get error here
	public static void main(String[] args) 
	{
		System.out.println("value of i: " + i);
		System.out.println("value of j: " + j);	
	}
}

//since we are refering to something that has no value or has not been initialized



