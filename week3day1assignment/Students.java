package week3day1assignment;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("ID:"+id);
	}
public void getStudentInfo(int id,String name) {
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
	}
public void getStudentInfo(String email,long phoneNo) {
	System.out.println("Mail ID:"+email);
	System.out.println("Phone Number:"+phoneNo);

}
	public static void main(String[] args) {
		Students obj=new Students();
		obj.getStudentInfo(11223);
		obj.getStudentInfo(11243,"Durga");
		obj.getStudentInfo("durga@gmail.com",9123456780l);
	}

}
