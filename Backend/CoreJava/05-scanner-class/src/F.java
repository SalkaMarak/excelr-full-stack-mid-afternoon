import java.util.Scanner;
class F
{
	public static void main(String[] args) 
	{
		System.out.println("Enter our first name");
		Scanner sc = new Scanner(System.in); 
		String name = sc.next(); 
		System.out.println("Enter your address");
		sc.nextLine(); //this will comsume the entire line to make the below method to input next whole line.
		String address = sc.nextLine();
		System.out.println("Your name: " + name + ", Your Address: " + address);	
		
		sc.close();
	}
}

//sc.close() is used to close the opened resourse and avoid some mixed up inputs.




