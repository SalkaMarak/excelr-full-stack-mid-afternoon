class EmailPin 
{
	private String email;
	private int pin;
 
//-------------------getter setter method for Email
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
//----------------getter setter method for Pin
	public int getPin()
	{
		return pin;
	}
	public void setPin(int pin)
	{
		this.pin = pin;
	}
}
class mainDriver2
{
	public static void main(String[] args)
	{
		EmailPin ep1 = new EmailPin(); 
		ep1.setEmail("Sal@35.com");
		ep1.setPin(4845);
		System.out.println(ep1.getEmail());
		System.out.println(ep1.getPin());
	}
}
