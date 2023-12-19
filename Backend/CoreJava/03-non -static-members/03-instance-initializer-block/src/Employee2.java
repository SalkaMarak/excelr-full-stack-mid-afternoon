class Employee2 
{
	//data members
	String employeeName, companyName;
	int rollNum;
	int age; 

	Employee2(String localEmployeeName, int localRollNum, int localAge)
	{
		employeeName = localEmployeeName;
		rollNum = localRollNum;
		age = localAge;
	}

	{
		companyName = "ExcelR";
	}

	public static void main(String[] args) 
	{
		Employee2 emp1 = new Employee2("john", 101, 32);
		System.out.println("-----------");
		Employee2 emp2 = new Employee2("oricco", 102, 48);
		System.out.println("-----------");
		Employee2 emp3 = new Employee2("reign", 103, 54);
		System.out.println("-----------");
		Employee2 emp4 = new Employee2("sul", 104, 65);
		System.out.println("-----------");
		
		System.out.println(emp1.employeeName);
		System.out.println(emp1.companyName);
		System.out.println(emp1.rollNum);
		System.out.println(emp1.age);
		System.out.println("-----------");
		System.out.println(emp2.employeeName);
		System.out.println(emp2.companyName);
		System.out.println(emp2.rollNum);
		System.out.println(emp2.age);
		System.out.println("-----------");
		System.out.println(emp3.employeeName);
		System.out.println(emp3.companyName);
		System.out.println(emp3.rollNum);
		System.out.println(emp3.age);
		System.out.println("-----------");
		System.out.println(emp4.employeeName);
		System.out.println(emp4.companyName);
		System.out.println(emp4.rollNum);
		System.out.println(emp4.age);
		System.out.println("-----------");
	}
}

//if we dont use this in constructor initialization we will get the default values that is null 0 0. To set the values to respective objects we use this keyword while initializing. (we use this as global reference)


//ALTERNATIVELY WE CAN DO THIS.
