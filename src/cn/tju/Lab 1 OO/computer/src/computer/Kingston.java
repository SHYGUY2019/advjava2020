package computer;

public class Kingston extends internal_memory {
	public Kingston(String Name, int volume, double price) {
		super(Name, volume, price);
		// TODO Auto-generated constructor stub
	}

	public String Name = "Kingston";
	public int volume = 256;
	public double price = 900;
	
	public void work()
	{
		System.out.println("Kingston internal_memory work");
	}

}
