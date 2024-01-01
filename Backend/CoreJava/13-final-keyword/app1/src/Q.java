class Q
{
	final int i;
	//we have to initialize this in the constructor or the IIB. 
	
	void test()
	{
		i = 10;
	}
}

//error: because the comipler thinks that we have initialize the i value in constructor or iib and we are trying to reinitialize i value in test methods.