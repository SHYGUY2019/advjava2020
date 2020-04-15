package computer;

public class Samsung extends internal_memory {
	public Samsung(String Name, int volume, double price) {
		super(Name, volume, price);
		// TODO Auto-generated constructor stub
	}

	public String Name = "Samsung";
	public int volume = 128;
	public double price = 200;
	
	public void work()
	{
		System.out.println("Samsung Samsung internal_memory work");
	}

}
