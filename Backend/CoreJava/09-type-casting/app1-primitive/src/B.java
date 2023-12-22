class B 
{
	public static void main(String[] args) 
	{
		byte b = 10;
		int i = b;
		System.out.println("b: " + b + " , " + "i: " + i);
	}
}

//we are supplying byte value(smaller range) to int(larger range), Auto upcasting will happen.