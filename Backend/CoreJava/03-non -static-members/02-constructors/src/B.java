class B 
{
	B()
	{
	}

	public static void main(String[] args) 
	{
		B b1 = new B(); 
		System.out.println("done");
	}
}

/*
-we can also create the constructor.
-constructors should be within a class and outside of any method.
-if we are keeping atleast one explicite constructor then, compiler will not be keeping no-arg constructor.
-constructors are treated as special type of methods internally, but they are not normal methods. There is a difference betw constructors and methods.

----------DIFFERENCE being:-------------------------
-constructors are going to be invoked whenever we are creating the object.
-compulsary there should be an object creation to invoke the constructor in the beginning.
-methods are going to be invoked whenever we call them.))

----------RULES for constructors:------------------
1. Constructors name should be same as class name.(case-sensitive)
2. There is no return type for a constructor.
3. Compulsary constructors should be concrete, or defined, implemented, it should be having a body, {}.

---------SIMILARITIES betw const and methods:------
-Parameter(any nos., can be any type)
-both should be having a concrete, defined, implemented body.
-both can have access specifier.
-we can have any no of construtors and methods in a class but arguments must be different(for a group of constructors ...
*/