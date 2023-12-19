class O 
{
	O(int i)
	{
		System.out.println("int()");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		O o1 = new O(); //passing no arguement,not compatable.
		O o2 = new O(10); //passing int as required.		
		System.out.println("main end");
	}
}

//Error since there is an arguement constructor taking int type. if we have made a constructor then compiler will not make a default no args const.
