class R 
{
	public static void main(String[] args) 
	{	
		boolean flag = true;
		if(flag != !(false == !(!(flag == false) == (flag == true))))
		{
			System.out.println("From if");
		}
		System.out.println("end of main: " + flag);
	}
}


