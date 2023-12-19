class J
{
	static int i = test1();
	static int test1()
	{
		System.out.println("from test1");
		main(null); //explicitely calling main method by supplying null as the argument(reference)
		return 10;
	}
	public static void main(String[] args)
	{
		System.out.println("from main");
		System.out.println(i);
	}
}

/*interview question: 
Q. is there any possibility of executing main method before it gets automatically executed by the JVM?
-yes, by supplying null as the arguement.

from test1
from main (main method explicitely called by us) 
0
from main (now jvm calls main method)
10
*/
