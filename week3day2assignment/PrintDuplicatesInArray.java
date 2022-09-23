package week3day2assignment;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int [] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> list=new ArrayList<Integer>();
		int count;
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			count=0;
			for (int j = i+1; j < list.size(); j++) {
				if(list.get(i)==list.get(j))
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println("Duplicates are:"+list.get(i));
			}
		}

	}
}
