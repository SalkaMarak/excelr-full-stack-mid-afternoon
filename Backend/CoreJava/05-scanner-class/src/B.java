import java.util.Scanner;
class B
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your first name");
		Scanner sc = new Scanner(System.in); //input stream
		String name = sc.nextLine();
		System.out.println("Welcome: " + name);
	}
}


//------------scanner class-----------
//we can read input from user.
//its available in the util package we have o import it explicitely.

//java.lang package - String and system class, we can use directly w/o importing

/*
we have many methods:
-next() methods: reads the complete token(a single character or a group of chracters without any space) in the form of String. Return type is String.
-nextLine(): reads the entire line without any spaces

There are three kinds of streams: input, output, error.

System.in -input stream
System.out- output stream.
*/