package prac;

import java.util.ArrayList;
import java.util.List;

public class ArrayToArrayList {

	
	public static void main(String[] args) {
		
		Integer[] x= {1,2,3,4,5,6,7,8};
		
		List<Integer> arrayList=new ArrayList<>();
		
		/*
		 * Collections.addAll(arrayList, x);
		 * 
		 * System.out.println(arrayList);
		 * 
		 * for (Integer value : arrayList) {
		 * 
		 * System.out.println(value); }
		 */
		
		for (int i = 0; i < x.length; i++) {
			
			arrayList.add(x[i]);
		}
		System.out.println(arrayList);
	}
}
