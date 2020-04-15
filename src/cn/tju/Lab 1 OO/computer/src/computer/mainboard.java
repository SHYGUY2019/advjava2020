package computer;

public abstract class mainboard {
	public String Name;
	public double speed; //µ¥Î»MHZ;
	public double price;
	
	public mainboard(String Name, double speed, double price) {
		this.Name = Name;
		this.speed = speed;
		this.price = price;
	}
	
	public abstract void work();

}
