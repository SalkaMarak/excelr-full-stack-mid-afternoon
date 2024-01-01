interface G
{
	void test() //since compiler adds abstract keyword.
	{
	}
}

/*error: interface abstract methods cannot have body.

- interface method return type can be anything. they cannot have a body.
- Interface does not allow any normal implemented methods, this is how we can acheive 100% abstraction. */
        