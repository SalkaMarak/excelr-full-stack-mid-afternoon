class K
{
    public static void test(final int i, int j)
    {
		i = 10;
        j = 20;
        System.out.println(i);
        System.out.println(j);
    }
}

/*
K.java:5: error: final parameter i may not be assigned
                i = 10;
                ^
1 error */