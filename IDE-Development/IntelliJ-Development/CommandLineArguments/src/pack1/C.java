package pack1;

public class C
{
    public static void main(String[] args)
    {
        for (int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]); //[i] inside means location
        }
    }
}
//we supply abc and xyz as a command line argument during running separated by space
//OUTPUT
// abc
//xyz

//arrays start from 0,1,2,3...