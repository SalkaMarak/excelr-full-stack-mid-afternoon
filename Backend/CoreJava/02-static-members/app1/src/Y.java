class Y 
{
	static int i = j; //error
	static int j;
	public static void main(String[] args) 
	{
		System.out.println("value of i: " + i);
		System.out.println("value of j: " + j);	
	}
}

//we cannot initialize before declaring the variable, since j is declared in the next line. 

//ILLIGAL FORWARD REFERENCE ERROR




