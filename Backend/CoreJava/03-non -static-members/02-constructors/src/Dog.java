class Dog 
{
	//properties, attributes, data members, fields
	String name, breed, gender, colour;
	int age;
	double height, weight;

	Dog(String dogName, String dogBreed, String dogGender, String dogColour, int dogAge, double dogHeight, double dogWeight) //accepting
	{
		System.out.println("initializing dog object begin");
		name = dogName; 
		breed = dogBreed;
		gender = dogGender;
		colour = dogColour;
		age = dogAge;
		height = dogHeight;
		weight = dogWeight;
		System.out.println("initializing dog object end");
	}

	//behaviours, member functions
	
	void bark()
	{
		System.out.println("This dog barks!");
	}

	void bite()
	{
		System.out.println("This dog bites!!");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Dog d1 = new Dog("Charlie", "lab", "male" , "brown", 2, 2.8, 5.8);
		Dog d2 = new Dog("Bob", "lab", "female" , "white", 3, 2.1, 4.8); //supplying
		System.out.println("name: " + d1.name + " breed:" + d1.breed + " gender: " + d1.gender + " colour: " + d1.colour + " age: " + d1.age + " height: " + d1.height + " weight: " + d1.weight);
		d1.bite();
		System.out.println("-----------------------");
		System.out.println("name: " + d2.name + " breed:" + d2.breed + " gender: " + d2.gender + " colour: " + d2.colour + " age: " + d2.age + " height: " + d2.height + " weight: " + d2.weight);
		d2.bark();
		System.out.println("main end");
	}
}


//for each and every object creation each and every non static methods/ variables copies are created.