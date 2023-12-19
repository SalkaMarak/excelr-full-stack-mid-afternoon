import java.util.Scanner;
class D
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your CGPA");
		Scanner sc = new Scanner(System.in); //input stream
		double cgpa = sc.nextDouble();
		System.out.println("Your CGPA is: " + cgpa);
	}
}



/*
we have many methods:
-next() methods: reads the complete token(a single character or a group of chracters without any space) in the form of String. Return type is String.
-nextLine(): reads the entire line without any spaces
-nextInt(): read the input as int
-nextDouble(): reads input in double.
*/
