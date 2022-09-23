package week3day1assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text="we learn java basics as part of java session oF learn in Java week1";
		String[] split= text.split(" ");
		int count =0;
		
		for(int i=0;i<split.length;i++) {
			for(int j=i+1;j<split.length;j++) {
				if(split[i].equalsIgnoreCase(split[j])) {
					split[j]="";
					count++;
				}
			}
		}
		if(count>1) {
			for(int k=0;k<split.length;k++) {
				System.out.print(split[k]+" ");
			}
		}

		}
	
}
