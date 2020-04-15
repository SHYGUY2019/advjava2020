package computer;

public class WestDigitals extends disk {
	public String Name = "WestDigitals";
	public int volume = 4;
	public double price = 700;
	
	public WestDigitals(String Name, int volume, double price) {
		super(Name, volume, price);
		// TODO Auto-generated constructor stub
	}
	public void work() {
		System.out.println("WestDigitals disk work");
	}

}
