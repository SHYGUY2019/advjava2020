package computer;

public class AMD extends CPU{
	public String Name;
	public int coreNum;
	public double price;
	
	public AMD(String Name, int coreNum, double price) {
		super(Name, coreNum, price);
		// TODO Auto-generated constructor stub
	}

	public void work(){
		System.out.println("AMD CPU work");
	}

}
