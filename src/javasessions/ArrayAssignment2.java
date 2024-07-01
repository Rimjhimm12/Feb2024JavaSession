package javasessions;

import java.util.Arrays;

public class ArrayAssignment2 {

	public static void main(String[] args) {
		/** Write a program to create a static Array, having following cricket data:

                        --name, age, team name, DOB, gender, Strike Rate

                        --Try to create multiple Object Arrays for different players 

                        --Try to print all the values of each player on the console using for and for each loops**/
		
		Object arrayOfCricketer1 [] = new Object [6];
		arrayOfCricketer1[0] = "MS Dhoni";
		arrayOfCricketer1[1] = 44;
		arrayOfCricketer1[2] = "RCB";
		arrayOfCricketer1[3] = "23Mar1984";
		arrayOfCricketer1[4] ='M';
		arrayOfCricketer1[5] = 34.3f;
		for(int i =0; i<=arrayOfCricketer1.length-1; i++) {
			System.out.println(arrayOfCricketer1[i]);
		}
		
		System.out.println("_________________________________________________________________________");
		
		Object arrayOfCricketer2 [] = new Object [6];
		arrayOfCricketer2[0] = "Virat koli";
		arrayOfCricketer2[1] = 32;
		arrayOfCricketer2[2] = "MCB";
		arrayOfCricketer2[3] = "12Oct1994";
		arrayOfCricketer2[4] ='M';
		arrayOfCricketer2[5] = 114.3f;
		for(int i =0; i<=arrayOfCricketer1.length-1; i++) {
			System.out.println(arrayOfCricketer1[i]);
		}
		
		System.out.println("_________________________________________________________________________");

		Object arrayOfCricketer3 [] = {"Saurav G", 52, "KKR", "04Dec1972", 'M', 23.9f};
		for(Object e:  arrayOfCricketer3) 
			System.out.println(e);
		
		/**Print all the elements of this array using for, for each, while and do-while loop:

			int p[] = {1,3,4,5,22,56,89,90}*/
		
		System.out.println("_______________________Using For-Each loop__________________________________________________");
		int p[] = {1,3,4,5,22,56,89,90};
		for(int e: p)
			System.out.println(e);
		System.out.println("_______________________Using For-Each loop in revers__________________________________________________");
		int reversArr [] = new int[p.length];
		int newArr =0;
		for(int r=p.length-1; r>=0;r--) {
			reversArr [newArr] = p[r];
			newArr++;
		}
		
		for(int e:reversArr)
			System.out.println(e);
			
		
		System.out.println("_______________________Using For loop__________________________________________________");
		for(int e=0; e<=p.length-1;e++)
			System.out.println(p[e]);
		System.out.println("_______________________Using For loop in revers order__________________________________________________");
		for(int e=p.length-1; e>=0;e--)
		System.out.println(p[e]);
		
		System.out.println("_______________________Using while loop__________________________________________________");
		int e =0;	
		while(e<=p.length-1) {
			System.out.println(p[e]);
			e++;
		}
		System.out.println("_______________________Using while loop in revers order__________________________________________________");
		int f =p.length-1;	
		while(f>=0) {
			System.out.println(p[f]);
			f--;
		}
		
		System.out.println("_______________________Using do-while loop__________________________________________________");
		int j =0;
		do {
			System.out.println(p[j]);
			j++;
		} while (j<=p.length-1);
		System.out.println("_______________________Using do-while loop in revers order__________________________________________________");
		int h =p.length-1;
		do {
			System.out.println(p[h]);
			h--;
		} while (h>=0);
		

	}

}
