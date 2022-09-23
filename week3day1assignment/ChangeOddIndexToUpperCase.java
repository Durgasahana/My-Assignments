package week3day1assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String str="changeme";
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(i%2!=0)
			{
			char c = charArray[i];
			String string = Character.toString(c);
			System.out.println(string.toUpperCase());
			}
			else
			{
				char c1=charArray[i];
				String string = Character.toString(c1);
				System.out.println(string);
			}
		
		}
				

	}

}
