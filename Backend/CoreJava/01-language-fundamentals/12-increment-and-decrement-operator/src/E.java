class E
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i--;
		System.out.println(j); //0
		System.out.println(i); //-1
		System.out.println(j); //0
		System.out.println(i); //-1
	}

}




