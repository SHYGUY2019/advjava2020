package computer;

public abstract class CPU {
	public String Name;
	public int coreNum;
	public double price;
	public CPU(String Name, int coreNum, double price) {
		this.Name = Name;
		this.coreNum = coreNum;
		this.price = price;
	}
	public abstract void work();	
}
