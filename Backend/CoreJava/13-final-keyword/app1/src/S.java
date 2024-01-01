class S
{
    final int x = 10;

    {
		x = 20; //error
    }

	S()
	{
	}
	 
	S(int i)
	{
	}
}

//since we are initializing the final value in the IIB which is already initialized.