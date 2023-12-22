class I 
{
	static int test(byte b)
	{
		return b;
	}

	public static void main(String[] args) 
	{
		byte b = 10;
		System.out.println(test(b) + ": done");
	}
}

//byte will be auto upcasted to int type in test method return.