package week3day2assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		Integer []arr= {1,2,3,4,6,7,8};
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(arr));//without using loop
		
		System.out.println(list);
		for (int i = 0; i <list.size(); i++) {
			
				if(list.get(i)!=i+1)
				{
					System.out.println(i+1);
					break;
				}
			}

		}
	

}
