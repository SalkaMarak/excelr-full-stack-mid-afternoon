class E
{
    public static void main(String[] args)
    {
        final E e1 = new E();
		e1 = null;
		e1 = new E();
        System.out.println("done");
    }
}

//making reference as final

/*ERROR
E.java:6: error: cannot assign a value to final variable e1
                e1 = null;
                ^
E.java:7: error: cannot assign a value to final variable e1
                e1 = new E();
                ^
*/