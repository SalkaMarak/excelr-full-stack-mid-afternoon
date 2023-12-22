class  A
{
	static int add(int i, int j)
	{
		return i + j;
	}
	static int add(int i, int j, int k)
	{
		return i + j + k;
	}
	static int add(int i, int j, int k, int l)
	{
		return i + j + k + l;
	}

	public static void main(String[] args) 
	{
		System.out.println(add(10, 20));
		System.out.println(add(10, 20, 30));
		System.out.println(add(10, 20, 30, 40));
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

functionally remains the same, we have multiple methods for the same fuction(addition)- this is overloading.

-Overloading is an example for compile time polymorphism. All the methods can be static/non static in the same-class. But usually we keep it as static. Since we can acheive overloadig easily in the same class by using static methods and all these static methods are loaded at the compile time, we are calling it as compile time polymorphism.
-Method parameters data type can be anything but it should be different for each methods.
*/
