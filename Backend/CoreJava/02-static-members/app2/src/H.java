class H
{
	public static void main(String[] args)
	{
		System.out.println("from H begin");
		System.out.println(G.i);
		System.out.println(G.test());
		System.out.println("from H end");
	}
	
}

/*
from h begin
from test (while running the method it prints this)
10(i value)
from test
10 (while returning it also prints i)
from h end
*/
