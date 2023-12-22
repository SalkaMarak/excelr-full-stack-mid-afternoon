class  B
{
	static void test()
	{
		System.out.println("test()");
	}
	static void test(int i, int j)
	{
		System.out.println("test(int, int)");
	}
	static void test(int i, int j, int k)
	{
		System.out.println("test(int, int, int)");
	}
	static void test(int i, int j, int k, int l)
	{
		System.out.println("test(int, int, int, int)");
	}

	public static void main(String[] args) 
	{
		B.test();
		B.test(10, 20);
		B.test(10, 20, 30);
		B.test(10, 20, 30, 40);
		System.out.println("done");
	}
}


/*---polymorphism------
-Achieving the same thing in different ways.
-We can perform a single action in different ways.
-Polymorphism is derived from 2 greek words: Poly-many, morphs-forms.

There are two types of polymorphism in Java:
1. Compile-time polymorphism.
2. Run-time polymorphism.

compile-time polymorphism can be achieved through overloading.
run-time polymorphism can be achieved through overriding.

Q. What are all the rules for overloading?
1. We can achieve overloading in the same class. 
2. Method name can be same. <==========***
3. Method parameters should be different.
4. Return type can be same or different.

-we can avoid un-necessary method name complications.
-since all the methods are doing the same task, we can keep the method name same for all the methods.
-But those methods might perform the task in different ways.

functionally remains the same, we have multiple methods for the same fuction(printing in this case)- this is overloading.

-Overloading is an example for compile time polymorphism. All the methods can be static/non static in the same-class. But usually we keep it as static. Since we can acheive overloadig easily in the same class by using static methods and all these static methods are loaded at the compile time, we are calling it as compile time polymorphism.
*/
