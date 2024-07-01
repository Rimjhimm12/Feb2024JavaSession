package javasessions;

public class Assignment {

	public static void main(String[] args) {
		// Assignment 1:
		
		/**?
		 * Write a Java program to add two strings:

		*  String a = “Hello”;
		
		*  String b = “Rimjhim Mallick”
		*/
		
		String a = "Hello";
		String b = "Rimjhim Mallick";
		System.out.println(a+" "+b);//Hello Rimjhim Mallick
		
		// Assignment 2:
		/**
		 * Write a Java program to print the sum of two numbers.

		*	Test Data:
			
		*	 74 + 36 
			
		*	Expected Output:
			
		*	110
		 */
		
		System.out.println(74 + 36);//110
		
		// Assignment 3:
		/**
		 * Write a Java program to print the division of two numbers.

		 *	k = 50/3
			
		 *	Expected Output :  16
		 */
		
		int k = 50/3;
		System.out.println(k);//16

		// Assignment 4:
		/**
		 * Write a Java program to compute the specified expressions and print the output. Go to the editor.

		*	Test Data:
			
		*	((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
			
		*	Expected Output
			
		*	2.138888888888889
		 */
		
		System.out.println((double)((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));//2.138888888888889
		// Assignment 5:
		/**Try to concat "Hello Selenium" with a character 't'.

		*	
		 */
		
		String a1 = "Hello Selenium";
		
		char b1 = 't';
		System.out.println(a1+b1);//Hello Seleniumt
		// Assignment 6:
		/**
		 *  Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 

		"Your Total  amount is: 3700"
		 */
		int f1 = 100;
		int f2 = 200;
		int f3 = 3400;
		
		System.out.println("Your Total amoubt is: "+(f1+f2+f3));
		
		//Assignment 7:
		/*Print the ASCII value of the character 'h'.*/
		char H = 'h';
		System.out.println((byte)H);//104
		//Assignment 8:
		/*Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.*/
		char ch = 'd';
		System.out.println((char)((byte)(ch+3)));//103
		//Assignment 9:
		/*Write a program to find the square of the number 3.9*/
		System.out.println((double)Math.pow(3.9,2));
		
		char s1 = 'a';
		char s2 = 'b';
		System.out.println((char)(byte)('a'+'b'));
	}

}
