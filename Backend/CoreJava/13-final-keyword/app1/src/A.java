class A
{
    public static void main(String[] args)
    {
        int i = 10;
		final int j = 20;

        System.out.println(i);
        System.out.println(j);

        i = 15;
        System.out.println(i);
        //j = 25; error if we do this
    }
}

/* 
- Final keyword can be used along wiht static, non-static or local variable.
- Theres no default value.
- Once final it cannot be changed. 
*/