package week1.day2.assignment2;

public class MissingElement {
public static void main(String[] args) {
	int []arr= {1,2,3,4,6,7,8};
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]!=i+1)
		{
			System.out.println(i+1);
			break;
		}
	}
}
}
