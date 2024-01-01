abstract class CarDriver
{
	public void howToDriveACar()
	{
		System.out.println("I have a liscence and can drive");
	}

	abstract void technicalDetails(); 
	//we are hiding the code, by not implementing.
	//abstract methods cannot contain a body
}

class Car extends CarDriver 
{
	void technicalDetails()
	{
		System.out.println("Technical things like engine, TPMS, TPMS, AORVMS, HillHoldAssist");
	}
	public static void main(String[] args)
	{
		Car safari = new Car();
		safari.howToDriveACar();
		safari.technicalDetails();
		System.out.println("done");
	}
}

