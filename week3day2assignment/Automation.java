package week3day2assignment;

public class Automation  extends MultipleLanguage implements Language,TestTool {

	public static void main(String[] args) {
		Automation obj=new Automation();
		obj.java();
		obj.python();
		obj.ruby();
		obj.Selenium();


	}

	public void Selenium() {
		System.out.println("Selenium method");

	}

	public void java() {
		System.out.println("Java Method");	

	}

	@Override
	public void ruby() {
		System.out.println("Ruby method");

	}

}
