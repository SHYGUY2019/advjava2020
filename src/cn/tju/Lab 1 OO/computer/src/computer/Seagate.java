package computer;

public class Seagate extends disk {


	public String Name = "Seagate";
	public int volume = 4;
	public double price = 700;
	
	
	public Seagate(String Name, int volume, double price) {
		super(Name, volume, price);
		// TODO Auto-generated constructor stub
	}
	public void work() {
		System.out.println("Seagate disk work");
	}
}
