package computer;

public class ComputerStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU cpu1 = new Intel("Intel",4,500);
		CPU cpu2 = new AMD("AMD", 4, 400);
		internal_memory i1 = new Samsung("Samsung",8,400);
		internal_memory i2 = new Kingston("Kingston", 16, 800);
		disk disk1 = new Seagate("Seafate",128,350);
		disk disk2 = new WestDigitals("WestDigitals",256,590);
		mainboard m1 = new Asus("Asus",3000,700);
		mainboard m2 = new Gigabyte("Gigabyte",4000,900);
		
		System.out.println("---------The first computer----------");
		computer computer01 = new computer("A01", cpu1, i1, disk1, m1); //计算机实例A01 Intel,Samsung ,Seafate ,Asus组成
		computer01.discribe();
		computer01.work();

		System.out.println("---------The second computer----------");
		computer computer02 = new computer("B02", cpu2, i2, disk1, m1); //计算机实例B02 AMD,Kingston ,Seafate ,Asus组成
		computer02.discribe();
		computer02.work();
		
		System.out.println("---------The third computer----------");
		computer computer03 = new computer("C03", cpu2, i2, disk1, m1); //计算机实例C03 Intel,Kingston ,Seafate ,Gigabyte组成
		computer03.discribe();
		computer03.work();

	}

}
