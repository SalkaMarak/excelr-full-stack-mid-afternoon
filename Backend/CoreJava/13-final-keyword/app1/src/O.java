class O
{
    final int i = 10;

    public static void main(String[] args)
    {
        O o1 = new O();
		o1.i = 20; //error
        System.out.println(o1.i);
    }
}

