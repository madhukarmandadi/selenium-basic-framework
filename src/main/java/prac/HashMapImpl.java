package prac;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapImpl {
	
	public static void main(String[] args) {
		
		
		Map<Integer, String> hashMap=new  HashMap<>();
		
		
		
		
		hashMap.put(1, "cricket");
		
		hashMap.put(2, "football");
		
		hashMap.put(3, "golf");
		
		System.out.println("hashMap:"+hashMap);
		
		ArrayList<Integer> keys= new ArrayList<>(hashMap.keySet());
		
		
		ArrayList<String> values= new ArrayList<>(hashMap.values());
		
		System.out.println("keys:"+keys);
		
		System.out.println("values:"+values);
	}

}
