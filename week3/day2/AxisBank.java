package week3.day2;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("deposit from Axis Bank");
	}
	public static void main(String[] args) {
		BankInfo b = new BankInfo();
		b.saving();
		b.fixed();
		b.deposit();
		
		AxisBank a = new AxisBank();
		a.deposit();
	}

}
