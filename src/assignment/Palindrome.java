package assignment;

import java.util.Arrays;

public class Palindrome {
	public static void getPalindromNumber(String palindrome) {
		char arr[] = palindrome.toCharArray();
		char revArrays[] = new char[arr.length];
		int j = 0;
		for(int i=arr.length-1; i>=0;i--) {
			revArrays[j] = arr[i];
			j++;
			
		}
		
		if(Arrays.toString(revArrays).equals(Arrays.toString(arr))) {
			System.out.println(palindrome+" is a palindrome");
			
		}
		else {
			System.out.println(palindrome+" not a palindrome");
			
		}
		

	}
	


	public static void main(String[] args) {
		getPalindromNumber("MOM");
		
		getPalindromNumber("KAKA");

	}

}
