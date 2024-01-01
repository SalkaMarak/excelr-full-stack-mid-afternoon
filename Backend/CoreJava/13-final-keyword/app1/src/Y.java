class Y
{
	final int x;

    Y(int x) //since this int x is supplied locally. Parameter variable. The global x is not initializing here.
    {
        x = 10;
		//this.x = 10;
		
    }
}
//error: //either change the local var name from x to y or give this.x = 10; which will refer to global variable.