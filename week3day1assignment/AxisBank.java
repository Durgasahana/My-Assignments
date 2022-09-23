package week3day1assignment;

public class AxisBank extends BankInfo{
public void deposit() {
		System.out.println("Axis Deposit Acoounts");

	}
	public static void main(String[] args) {
		
		AxisBank obj=new AxisBank();
		obj.deposit();
		obj.saving();
		obj.fixed();
	}

}
