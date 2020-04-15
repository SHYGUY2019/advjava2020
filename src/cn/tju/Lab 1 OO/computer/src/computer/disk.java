package computer;

public abstract class disk {
	public String Name;
	public int volume;
	public double price;
	
	public disk(String Name, int volume, double price) {
		this.Name = Name;
		this.volume = volume;
		this.price = price;
	}
   public abstract void work();
}
