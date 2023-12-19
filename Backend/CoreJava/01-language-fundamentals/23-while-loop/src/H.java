class H
{
	public static void main(String[] args)
	{
		int i = 0;
		while(i < 4)
		{
			i++;
			System.out.println("begin: " + i);
			if(i > 2)
			{
				continue;
			}
			System.out.println("end: " + i);
		}
	}
}

//to avoid a situation like G(last code) we give increment before the continue

/* begiin 1
end 1
begin 2
end 2
begin 3
begin 4 */


