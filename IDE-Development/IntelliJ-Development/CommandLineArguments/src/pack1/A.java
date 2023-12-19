package pack1;

public class A
{
    public static void main(String[] args) //accepting empty String array object which is created by the jvm as an argument.
    {
        System.out.println("done: " + args);
    }
}

/* --------CommandLine arguments----
-Args is a reference
-If we are trying to print the reference we will get object location memory location in like the  classname@hascode in the form of hexadecimal.
-At the time of running a program, we can pass some arguments to the program, that is what we can call Command Line arguments.
-While running a program even JVM also supply a default empty String array object as an argument to the main method of the class.
-We can supply some command line arguments and that would be converted into String object.
*/