import java.util.Scanner;
class E
{
	public static void main(String[] args) 
	{
		System.out.println("Modi is prime minister?");
		Scanner sc = new Scanner(System.in); 
		boolean status = sc.nextBoolean();
		if(status)
		{
			System.out.println("correct");
		}
		else
		{
			System.out.println("wrong");
		}
	}
}



/*
we have many methods:
-next() methods: reads the complete token(a single character or a group of chracters without any space) in the form of String. Return type is String.
-nextLine(): reads the entire line without any spaces
-nextInt(): read the input as int
-nextDouble(): reads input in double.
-nextBoolean(): read in boolean.
*/
