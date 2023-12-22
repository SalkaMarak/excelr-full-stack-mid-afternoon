class M13 
{
	public static void main(String[] args) 
	{
		
		A a1 = new C();			
		D d1 = (D)a1; //downcasting to D			
		System.out.println("done");
	}
}

//we will get classCastException bc a1 is pointing upto C but not D. 
//(dependent classes)