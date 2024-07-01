package arrayexercise;

import java.util.Arrays;

public class LevelOne {

	public static void main(String[] args) {
		// Creating and Initializing an Array
		int arr[] = {2, 5, 8, 34, 90, 21, 1};
		System.out.println("Length of the Array is: "+arr.length);
		System.out.println("Print the Array: " +Arrays.toString(arr));
		
		//Accessing Elements of an Array
		System.out.println("Value of arr[0] is: "+arr[0]);
		System.out.println("Value of arr[0] is: "+arr[4]);
		System.out.println("Value of arr[0] is: "+arr[6]);
		
		//Modifying Elements of an Array
		arr[4] = 12;
		System.out.println("Value of arr[0] is: "+arr[4]);
		
		//Looping through an Array
		System.out.println("Printing the arrays value through the for-each loop:\n");
		int count = arr.length -1;
		for(int e: arr) {
			System.out.println(e);
			count--;
		}
		
		//or
		
		for(int i=0; i<=arr.length-1;i++) {
			System.out.println("Index of Array_"+i+" = "+arr[i]);
			
		
			
		}
		//Sorting Array
		int arr1[] = {5, 7, 9, 32, 1, 0, 6};
		java.util.Arrays.sort(arr1);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr1));
		
		
	}

}
