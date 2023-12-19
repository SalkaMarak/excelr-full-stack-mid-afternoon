class D
{
	public static void main(String[] args) 
	{
		int i;
		int j = 10 + i + (i = 20);
		System.out.println(i);
		System.out.println(j);
	}
		
}

//we will get error since i was not declaired first
//java runs line to line

