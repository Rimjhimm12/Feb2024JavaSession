package arrayexercise;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7}; 
		// braking Array into two part
		//part 1: 1234
		int newArr1[] = new int[4];
		for(int i =0;i<=arr.length-4;i++) {
			newArr1[i] = arr[i] ;	
		}
		//System.out.println(Arrays.toString(newArr1));//1234
		
		//part 2: 567
		int newArr2[] = new int[arr.length];
		int j =0;
		for(int i =4 ;i<=arr.length-1;i++) {
			 newArr2[j] = arr[i];
			j++;
		}
		//System.out.println(Arrays.toString(newArr2));//5670000
		
		for(int i=0; i<=newArr1.length-1;i++) {
			newArr2[j]=newArr1[i];
			j++;
		}
		System.out.println(Arrays.toString(newArr2));//5671234S
		
	}

}
