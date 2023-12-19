//Global variables and static
class A 
{
	static int i; //field, attribute
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
/*
-Static is a keyword, -something that doesnt change.
-Variables, methods can be declared as static
-Static members are also called as class members.
-Static members are also called global variables. which means they are not tied to any method or block. They are also called as field or attribute.

-The default value for static int is 0.

process goes:
LOADING..INITIALIZATION..EXECUTION(top to bottom)


POINTS:
1. All the static members gets loaded to the memory while class is loading to the memory.
2. Static variables will be loading with their default values. ie we dont have to initialize explicitely.
3. All the static members gets loaded to the memory only once when class is loading to the memory for one execution.
4. All the static members initialized and executed from top to bottom only once for one execution.
5. All the static members gets loaded, initialized and executed before the execution of main method itself.
*/
