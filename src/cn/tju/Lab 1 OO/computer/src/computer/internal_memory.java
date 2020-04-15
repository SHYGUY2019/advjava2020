package computer;

public abstract class internal_memory {
	public String Name;
	public int volume;
	public double price;
	
	public internal_memory(String Name, int volume, double price) {
		this.Name = Name;
		this.volume = volume;
		this.price = price;
	}
	public abstract void work();

}
