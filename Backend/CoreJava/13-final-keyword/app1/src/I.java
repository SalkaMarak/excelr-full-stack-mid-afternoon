class I
{
    public static void main(String[] args)
    {
        final int[] x = new int[10];
		x = null; //we are trying to refer x to null
		x = new int[20]; //we are trying to assign a new array of size 20 to x which is final 
    }
}

//ERROR

//we can initialize the indexes [0] to [9] but not X itself