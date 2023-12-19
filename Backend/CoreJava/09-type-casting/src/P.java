class P 
{
	public static void main(String[] args) 
	{
		double d = 10.0;
		int i = d;
		System.out.println("done");
	}
}

//error: incompatible types: possible lossy conversion from double to int
//we CAN do it if we still want though.