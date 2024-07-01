package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CustomerHashMap {
	
	public static Integer CustomerSalary(String Customer) {
		Map<String,Integer > salary = new HashMap<String, Integer>();
		salary.put("Rimjhim", 96000);
		salary.put("Kaushik", 223000);
		salary.put("Aarab", 223900);
		salary.put("Kiran", 45098);
		salary.put("Srija", 89765);
		
		for(Map.Entry<String,Integer > e: salary.entrySet()) {
			System.out.println("Customer Name: "+e.getKey() +" ; Salary: "+e.getValue());
		}
		
		return salary.get(Customer);
		
	}
	


	public static void main(String[] args) {
//		int salary = CustomerSalary("Rimjhim");
//		System.out.println(salary);
		String arr[] = {"apple", "banana", "grapes", "apple", "apple", "kiwi", "grapes", "kiwi","watermelon"};
		Set<String> setFruits = new HashSet<String>();
		// find the unique fruit 
		for(int i =0; i<= arr.length-1; i++) {
			setFruits.add(arr[i]);	
		}
		System.out.println(setFruits);
		
		//most repeatable fruit
		HashMap<String, Integer> fruits = new HashMap<String, Integer>();
		for(int i =0; i<= arr.length-1; i++) {
			if(fruits.get(arr[i])==null) {
				fruits.put(arr[i], 1);
			}
			
			else
			fruits.put(arr[i], (fruits.get(arr[i])+1));	
		}
		System.out.println(fruits);
		
		//make a list of more then one fruits
		HashMap<String, Integer> multiFruits = new HashMap<String, Integer>();
		HashMap<String, Integer> singleFruits = new HashMap<String, Integer>();
		for(Map.Entry<String,Integer> e:fruits.entrySet()) {
			
			if(e.getValue()>1)
				multiFruits.put(e.getKey(), e.getValue());
		
			else
				singleFruits.put(e.getKey(), e.getValue());
			
		}
			
		System.out.println("List of multiple fruits:"+multiFruits);
		System.out.println("List of single fruit:"+singleFruits);
			
	}
	
	}


