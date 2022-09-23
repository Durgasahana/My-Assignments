package week3day1assignment;

public class StringPalindrome {

	public static void main(String[] args) {
		String str= "Madam";//239
		String reversestr="";//980
		for(int i=str.length()-1;i>=0;i--) {
			reversestr=reversestr+str.charAt(i);
		}if(str.equalsIgnoreCase(reversestr)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}

}
