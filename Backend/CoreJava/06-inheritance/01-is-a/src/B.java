class A 
{
	int i;
}
class B extends A
{
	int j;

	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}


/*
Q.What are the basic pillars of Object oriented programming? OR
What are the principles of Object oriented programming?

1. Inheritance
2. Abstraction
3. Encapsulation
4. Polymorphism

1. Inheritance: 
-we achieve inheritance through classes by using 'extends' keyword. [solid line]
-we achieve inheritance through interfaces by using 'implements' keyword. [dotted lines] 
-a class cannot extend one class at a time in case of extends, but with implements it is possible.
-Aquiring the properties and behaviours of another class (Parent class).
-Parent class ==> base class | Child class ==> derived/sub class.

TYPES: 
1. Single inheritance
2. Multiple inh
3. Multi-level inh
4. Hybrid Inheritance
5. Hierarchical inh

[Ambiguity: if the class is implementing two interfaces and there is methods/statements with same name in each interfaces there will be confusion.]

*/