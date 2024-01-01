class B
{
    public static void main(String[] args)
    {
        final int i;
        i = 10;
        System.out.println(i);
		//i = 20; error if we uncomment this
    }
}

//we can perform declaration and initialization in different lines for the LOCAL final variables. NOT GLOBAL.

//as long as we DONT use it its okay to JUST declare.


//'final' keyword is similar to 'const' in C programming. since we are acheiveing the job of 'const' keyword through 'final' in Java, this is why 'const' in Java in deprecated(unused).