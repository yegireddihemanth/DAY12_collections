package ai.jobiak.collectionsComparability;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("iPhone X", 85000);
		map.put("iPhone XS", 90000);
		map.put("iPhone XR", 79000);
		map.put("iPhone 11", 52000);
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map);
		
		
		
		

	} 

}
