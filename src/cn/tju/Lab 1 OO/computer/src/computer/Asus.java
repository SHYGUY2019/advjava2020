package computer;

public class Asus extends mainboard{
	public String Name = "Asus";
	public double speed = 4000; //µ¥Î»MHZ;
	public double price = 500;
	
	public Asus(String Name, double speed, double price) {
		super(Name, speed, price);
		// TODO Auto-generated constructor stub
	}

	
	public void work() {
		System.out.println("mainboard work");
	}

}
