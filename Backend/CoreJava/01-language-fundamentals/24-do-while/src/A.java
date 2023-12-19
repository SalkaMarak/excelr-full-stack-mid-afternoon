class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		do
		{
			System.out.println("body; " + i);
			i++;
		}
		while (i < 5);
		System.out.println("main end");
	}
}

/*
DO while is another loop in java; first execute the body then checking the condition, if true then again execute the body and check the condition.

One itteration is guaranteed even if the condition is fails. 

itteration is execution of body
*/
