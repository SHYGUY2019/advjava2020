package computer;

public class Intel extends CPU {

	public String Name;
	public int coreNum;
	public double price;
	
	public Intel(String Name, int coreNum, double price) {
		super(Name, coreNum, price);
		// TODO Auto-generated constructor stub
	}


	
	public void work() {
		System.out.println("Intel CPU work");
	}
	

}
