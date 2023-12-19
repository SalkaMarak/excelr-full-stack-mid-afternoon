class E 
{
	public static void main(String[] args) 
	{
		int i = 0;
		do
		{
			System.out.println("begin: " + i);
			i++;
			if(i > 3)
			{
				continue;
			}
			System.out.println("end: " + i);
		}
		while (i < 10);
	}
}

/*
i= 0,1,2

begin 0
end 1
begin 1
end 2
begin 3
begin 4,5,6,7,8,9
*/

