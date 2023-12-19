package pack1;

public class B
{
    public static void main(String[] args)
    {
        for (String str : args)
        {
            System.out.println(str);
        }
        System.out.println("Total no of arguements that you have passed: " + args.length);
    }
}
/*
-we supply abc xyz 123 true 20.0 'a' as command line arguement.
-JVM created an empty string object {"", "", ""}
-which then assigns the supplied elements in it {"abc", "xyz, "20.0", "'a'"..} in the form of String.

-args.length : method to find length of that array object.
*/
