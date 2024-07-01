package javasessions;

public class LoopAssignment {

	public static void main(String[] args) {
		/**1. WAP to print following output:

 

I am Batman﻿

I am Batman﻿

I am Batman﻿

I am Batman

I am Batman***/
		for(int i=0;i<5;i++) {
			System.out.println("I am Batman");//according to the O/p
		}
//		for(;;) {
//			System.out.println("I am Batman");
//		}//Infinite loop
		
		System.out.println();
		
		/**2. WAP to print following output:

I am Batman 1

I am Batman 2

I am Batman 3

I am Batman 4

I am Batman 5

I am Batman 6

I am Batman 7

I am Batman 8

I am Batman 9***/
		
		for(int i=1;i<10;i++) {
			System.out.println("I am Batman "+i);
		}
		/*WAP to print 10 to 1 using for, while and do-while loop*/
		System.out.println("Print 10 to 1 using For loop");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println();
		
		System.out.println("Print 10 to 1 using While loop");
		int i=1;
		while(i<11) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		
		System.out.println("Print 10 to 1 using do While loop");
		int j =1;
		do {
			System.out.println(j);
			j++;
		} while (j<=10);

	}

}
