package arrayexercise;

import java.util.Arrays;

public class TestArraysSum {
	static int count = 6;
	static final int MAX_NUM =8;
	
	

	public static void  main(String[] args) {
		ArraysSum add = new ArraysSum();
		int arr1[] = {1, 2, 3};
		int arr2[] = {4, 5, 6};
		System.out.println("Sum of two arrays: "+  Arrays.toString(add.sumOfArray(arr1, arr2)));
		
		int arr[] = {5, 7, 4, 9, 1};
		System.out.println("Reverse arra is: " +Arrays.toString(add.reveresArray(arr)));
		
		
		
		TestArraysSum obj = new TestArraysSum();
		System.out.println(MAX_NUM);
		obj.main(12);
		//obj.main();
		main("Rimjhim");
		 
		
		
			
	}
	public void main() {
		//count =7;
		//TestArraysSum obj1 = new TestArraysSum();
		
		System.out.println(MAX_NUM);
		System.out.println("main method overloading"+count);
		//main(13);
		
	}
	public static void main(String args) {
		
		System.out.println("main method overloading with diffrent parammeter: "+args+count);
	}
	
	public void main(int a) {
		
		System.out.println("main method overloading with diffrent parammeter: "+count+a);
		System.out.println(MAX_NUM);
		main();
	}
	
	
	

	
}
  