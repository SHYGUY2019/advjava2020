package computer;

public class Gigabyte extends mainboard{
	public String Name = "Gigabyte";
	public double speed = 3000; //µ¥Î»MHZ;
	public double price = 400;
	
	public Gigabyte(String Name, double speed, double price) {
		super(Name, speed, price);
		// TODO Auto-generated constructor stub
	}

	public void work() {
		System.out.println("Gigabyte mainboard work");
	}

}
