class F
{
    public static void main(String[] args)
    {
        F f1 = new F();
        final F f2 = new F();
		f1 = f2;
		f2 = f1; //here not possible
		f2 = null; //cant also refer to null
		f2 = new F(); //cant make new obj also
        System.out.println("done");
    }
}

//F2 reference is final now 