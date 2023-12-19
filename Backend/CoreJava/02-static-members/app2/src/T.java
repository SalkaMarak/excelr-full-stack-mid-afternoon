class S
{
	static
	{	
		System.out.println("SIB-S");
	}
	public static void main(String[] args)
	{
		System.out.println("S-main");
	}
	
}
class T
{
	static
	{
		System.out.println("SIB-T");
	}
	public static void main(String[] args)
	{
		System.out.println("T-main-begin");
		S.main(null);
		S.main(args);
		S.main(null);
		System.out.println("T-main-end");
	}
}

//suppying args as arguements we are calling main method of S
//SIB-S is printed while loading S class in the memory, while running T class file.

//Static blocks/members is only loaded once while loading the class.