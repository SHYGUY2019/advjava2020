package computer;

public class computer {
	public String computerName;
	public double totalPrice; //总价格
	private CPU CPU; //computer 含有 CPU
	private internal_memory InternalMemory; //computer 含有内存
	private disk Disk; //computer 含有 硬盘
	private mainboard mainboard;// computer 含有 主板
	
	
	public computer(String computerName, CPU CPU, internal_memory InternalMemory, disk Disk, mainboard mainboard) {
		this.computerName = computerName;
		this.CPU = CPU;
		this.InternalMemory = InternalMemory;
		this.Disk = Disk;
		this.mainboard = mainboard;		
	}

	public void discribe() {
		System.out.println("The name of this computer is " + computerName);
		System.out.println("The CPU is " + CPU.Name + ", internal memory is " 
		+ InternalMemory.Name + ", disk is " + Disk.Name + ", mainboard is " + mainboard.Name);
		totalPrice = CPU.price + InternalMemory.price + Disk.price + mainboard.price;
		System.out.println("The total price of this computer is " + totalPrice);
		
		
	}//计算机的描述
	
	public void work() {
		CPU.work();
		InternalMemory.work();
		Disk.work();
		mainboard.work();
	}
		
	
}
