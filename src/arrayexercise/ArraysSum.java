package arrayexercise;

public class ArraysSum {
	
	////Sum of two numbers 
	
	public int[] sumOfArray(int arr1[], int arr2[]){
		
		int sum[] = new int[arr1.length];
		for(int i =0; i<=arr1.length-1;i++) {
		sum[i] = arr1[i] +arr2[i];
		}
		
		return sum;
	}
	
	
	//Reveres Array
	
	public int[] reveresArray(int arr[]) {
		int revArr[] = new int[arr.length];
		int j =0;
		for(int i =revArr.length-1; i>=0;i--) {
			revArr[j] = arr[i];
			j++;
		}
		return revArr;
	}
	
	
	public int methodOverloading(int a) {
		
		return 0;
			
	}
	public static String methodOverloading(int a, int b) {
		
		return null;
		
	}
	
	public static char methodOverloading(int b, String a) {
		return ' ';
		
	}
	
	public float methodOverloading(String a, int b) {
		
		
		return 0.1f;
		
	}
	public static char methodOverloading(String a, String b) {
		return ' ';
		
	}
	
	
	
	
	

}
