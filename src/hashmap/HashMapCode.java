package hashmap;


import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class HashMapCode {

	public static void main(String[] args) {
		HashMap<String, int[]> employee = new HashMap<String, int[]>();
		
		
		
		int[] valueOfAlpana = {101, 103, 106, 109};
		int length = valueOfAlpana.length;
		int[] valueOfBarun = {101, 102, 104, 108};
		int[] valueOfJharna = {101, 104, 108, 1016};
		int[] valueOfKaushik = {101, 105, 1010, 1015};
		int[] valueOfKhushi = {101, 103, 104, 105};
		int[] valueOfRimjhim = {1010, 1020, 1040, 1080};
		int[] valueOfSisir = {10101, 10202, 10420};
		
		employee.put("Alpana", valueOfAlpana);
		employee.put("Barun", valueOfBarun);
		employee.put("Jharna", valueOfJharna);
		employee.put("Kaushik", valueOfKaushik);
		employee.put("Khushi", valueOfKhushi);
		employee.put("Rimjhim", valueOfRimjhim);
		employee.put("Sisir", valueOfSisir);
		
		String arr = Arrays.toString(employee.get("Alpana"));
		System.out.println(arr);
		System.out.println("length is = "+valueOfSisir.length);
		
		System.out.println(employee.keySet());
		
		for(Map.Entry<String, int[]> e: employee.entrySet()) {
			System.out.println(e.getKey()+ "= "+e.getValue());
		}
		
		
		HashMap<String, Integer> student = new HashMap<String, Integer>();
		
		student.put("Jhon", 1);
		student.put("Kiki", 2);
		student.put("Mira", 3);
		student.put("Sham", 4);
		student.put("Aahan", 5);
		student.put(null, 6);
		student.put(null, 7);
		System.out.println(student);
		
		
		for(Map.Entry<String, Integer> e:student.entrySet()) {
			System.out.println(e.getKey()+" = "+e.getValue());
		}
		student.replace("Aahan", 8);
		System.out.println(student.keySet());

//		
//		int value = student.get("Jhon");
//		System.out.println(value);
//		
//		int hc = student.hashCode();
//		System.out.println(hc);
		
		HashMap<String, String > lhm =new LinkedHashMap<String, String >();
	
	}

}
