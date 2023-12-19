class  G
{
	static int count;
	
	//there is a no arg constructor created by the compiler.
	
	//IIB
	{
		count += 1; // count++;
	}

	public static void main(String[] args) 
	{
		G g1 =new G(); 
		G g2 =new G(); 
		G g3 =new G(); 
		G g4 =new G(); 
		G g5 =new G(); 

		System.out.println("No of objects created for G class: " + count);
	}
}
