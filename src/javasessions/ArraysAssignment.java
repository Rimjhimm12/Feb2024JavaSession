package javasessions;

import java.util.Arrays;

public class ArraysAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* WAP to delete a specific number from the given array */
		//int[] arr = { 1, 4, 5, 2, 3, 22, 31, 2 };
        
        //int indexOfElement = -1;

        // Find the index of the element to delete
//        for (int i = 0; i <= arr.length-1; i++) {
//            if (arr[i] != 22) {
//            	
//            	System.out.println(Arrays.toString(arr));
//            	
//            }
//            
//        }
//        
//        // If the element to delete was found
//        if (indexOfElement != -1) {
//            // Shift elements to the left starting from the index of the element to delete
//            for (int i = indexOfElement; i < arr.length - 1; i++) {
//                arr[i] = arr[i + 1];
//            }
//        }
//        for (int j = 0; j < arr.length-1; j++) 
//        	System.out.println(Arrays.toString(arr));
//
//              
        

        
    
		
		int arr[] = { 1, 4, 5, 2, 3, 22, 31, 2 };
		int newArr[] = new int[arr.length-1];
		int j =0;
		for(int i =0;i<=arr.length-1; i++)
		{ 
			if(arr[i] != 22)
			{
			newArr[j] = arr[i];
			j++;
		}
		
		}System.out.println(Arrays.toString(newArr));
		
		System.out.println("----------------------------------------------------------------------");
		/*you'll need to convert the characters A-Z, a-z, and 0-9 into arrays before using the for-each loop.*/
//		
			
		System.out.println("----------------------Creating an array with a-z,A-Z and 0-9 and printing respective ASCII value using For loop------------------------------------------------");
		
			char arrOfLowerCase[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
			char arrofASCIINum[] = "0123456789".toCharArray();
			char arrOfUpperCase[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
			for(char e: arrOfLowerCase) {	
				System.out.println(e+" = "+(int)e);
			}
			
			for(char e: arrOfUpperCase) {	
				System.out.println(e+" = "+(int)e);
			}
			for(char e: arrofASCIINum) {	
				System.out.println(e+" = "+(int)e);
			}
			
			System.out.println("-------------------------------Creating an array with a-z and printing respective ASCII value using For loop---------------------------------------");
			char arrOfSmallChar [] = new char[26];
			int i =0;
			for(char SmallChar = 'a';SmallChar<='z';SmallChar++) {
				
				arrOfSmallChar[i] = SmallChar;
				System.out.println(arrOfSmallChar[i]+" = "+(byte)arrOfSmallChar[i]);
				i++;
				
			}
			System.out.println("------------------Creating an array with A-Z and printing respective ASCII value using For loop----------------------------------------------------");
			char arrOfUpperChar [] = new char[26];
			int x = 0;
			for(char UpperChar = 'A';UpperChar<='Z';UpperChar++) {
				
				arrOfUpperChar[x] = UpperChar;
				System.out.println(arrOfUpperChar[x]+" = "+(byte)arrOfUpperChar[x]);
				x++;
			}
				
				System.out.println("------------------Creating an array with 0-9 and printing respective ASCII value using For loop----------------------------------------------------");

				char arrOfASCIINum [] = new char[10];
				int y=0;
				for(char numASCII = '0';numASCII<='9';numASCII++) {
					
					arrOfASCIINum[y] = numASCII;
					System.out.println(arrOfASCIINum[y]+ "="+(int)arrOfASCIINum[y]);
					y++;
				}
				
				
					
				}	
				
			}			
	

