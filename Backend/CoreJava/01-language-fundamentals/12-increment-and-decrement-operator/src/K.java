class K
{
	public static void main(String[] args) 
	{
		int x = 0;
		int y = x++ + x + x-- + x +
				x-- + x++ + x-- + x +
				x++ + x-- + x + x++;
		System.out.println(x); 
		System.out.println(y); 
	}

}
// 0,1




