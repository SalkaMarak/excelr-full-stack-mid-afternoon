class Employee 
{
	//data members
	String employeeName, companyName;
	int rollNum;
	int age; 

	Employee(String employeeName, int rollNum, int age)
	{
		this.employeeName = employeeName;
		this.rollNum = rollNum;
		this.age = age;
		//this is a keyword and refers to the current object.
	}

	{
		this.companyName= "ExcelR";
	}

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee("john", 101, 32);
		System.out.println("-----------");
		Employee emp2 = new Employee("oricco", 102, 48);
		System.out.println("-----------");
		Employee emp3 = new Employee("reign", 103, 54);
		System.out.println("-----------");
		Employee emp4 = new Employee("sul", 104, 65);
		System.out.println("-----------");
		
		System.out.println(emp1.employeeName);
		System.out.println(emp1.companyName);
		System.out.println(emp1.rollNum);
		System.out.println(emp1.age);
	}
}

//if we dont use this in constructor initialization we will get the default values that is null 0 0. To set the values to respective objects we use this keyword while initializing.
