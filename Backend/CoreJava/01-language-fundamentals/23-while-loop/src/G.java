class G
{
	public static void main(String[] args)
	{
		int i = 0;
		while(i < 4)
		{
			System.out.println("begin: " + i);
			if(i > 2)
			{
				continue;
			}
			System.out.println("end: " + i);
			i++;
		}
	}
}

/*
begin 0
end 0
begin 1
end 1
begin 2
end 2
begin 3
begin 3
begin 3
begin 3
.
.
.*/


