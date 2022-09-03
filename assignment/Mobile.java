package week1.day1.assignment;

public class Mobile {

	public void makeCall() {
		String mobileModel="SAMSUNG";
		float mobileWeight=15.05f;
		System.out.println("You can make a call now");
	}
	public void sendMsg() {
		boolean isFullyCharged=true;
		int mobileCost=9500;
		System.out.println("You can send messages");

	}
	public static void main(String[] args) {
		System.out.println("This is my mobile");
		Mobile obj=new Mobile();
		obj.makeCall();
		obj.sendMsg();

	}

}
