package StringClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringBuilderClass {

	public static void main(String[] args) {
		String str = "This is my java code and i am so happy, it is exciting me too much ";
		System.out.println(str.length()); 
		System.out.println("Li:"+ 0); 
		
		System.out.println("Li:"+ (str.length() -1)); 
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length() -1));
		
//		for(int i = 0; i<=str.length() -1; i++) {
//			System.out.println(str.charAt(i));
//			
//		}
		
			char [] arr = str.toCharArray();
			System.out.println(Arrays.toString(arr));
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == 'i') {
					System.out.println(i);
				}
			}
//		List rimiList = new ArrayList();
//		rimiList.add(1);
//		rimiList.add("Hello world");
//		System.out.println(rimiList.hashCode());
			
			System.out.println(str.indexOf('i'));
			System.out.println(str.indexOf('i', str.indexOf('i')+1));
			int a = str.indexOf('i', str.indexOf('i')+1);
			System.out.println(str.indexOf('i', a+1));
			System.out.println(str.indexOf('i', 26));
			System.out.println(str.lastIndexOf("too"));
			
			System.out.println(str.toUpperCase());
			System.out.println(str.trim());
			System.out.println(str);
			
			System.out.println(str.replace(" ", "_"));
			String str1 = str.replace(" ", "_");
			System.out.println(str.contains("java"));
			char [] arr1 = str.toCharArray();
			System.out.println(arr[0]);
			System.out.println(Arrays.toString(arr1));
			System.out.println(str1);
			String [] arr2 = str1.split("_");
			System.out.println(Arrays.toString(arr2));
			System.out.println(arr2[3]);
			
			String xPath = "//input[@id=\"fridtname\"]"; 
			System.out.println(xPath);
			
			
			StringBuilder sb = new StringBuilder("Hello");
			System.out.println(sb.append("Selenium"));
			System.out.println(sb.reverse());
			
		
			
			String str2 ="     ";
			System.out.println(str2.isBlank());

		
			
			
			
		
	}

}
