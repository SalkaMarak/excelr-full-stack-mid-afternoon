class M
{
    public static void main(final String[] args)
    {
       args = new String[20]; //error
	   args = null; //error
	   String[] s2 =  new String[10];
	   args = s2; //error
       System.out.println("done");
    }
}
