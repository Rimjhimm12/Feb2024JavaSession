package javasessions;

import java.util.Scanner;

public class AssignmentIfElseSwitchCase {

	private static final Object Chrome = null;

	public static void main(String[] args) {
		//  Assignment 1a:
		/**
		 * Find out the greatest number out of three different given numbers:

		*	Input the 1st number: 25 
			
		*	Input the 2nd number: 78 
			
		*	Input the 3rd number: 87
		 */
		
//		Scanner input1 = new Scanner(System.in);
//		System.out.println("Enter the 1st number:");
//		int numFirst = input1.nextInt();
//		System.out.println("Enter the 2st number: ");
//		int numSecond = input1.nextInt();
//		System.out.println("Enter the 3st number: ");
//		int numThird = input1.nextInt();
		int numFirst =259, numSecond = 78000, numThird = 8790;
		if(numFirst>numSecond && numFirst>numThird) 
			 System.out.println("The Greatest Value is:"+numFirst);
			 
		else if (numSecond>numThird)
				System.out.println("The Greatest Value is:"+numSecond);
		
		else
			System.out.println("The Greatest Value is:"+numThird);
		
		/**
		 * Find out the greatest number out of four different given numbers:

		*	Input the 1st number: 25 
			
		*	Input the 2nd number: 78 
			
		*	Input the 3rd number: 87
			
		*	Input the 4th number: 97
		 */
		
		int num1 =25, num2 = 78, num3= 807, num4= 97;
		if(num1>num2) {
			 if (num1>num3) {
				 if(num1>num4)
					 System.out.println("The Greatest Value is:"+num1);
			 }
			 
		}
		else if (num2>num3) {
			if(num2>num4) {
				if(num2>num1)
					System.out.println("The Greatest Value is:"+num2);	
			}
		}
		else if (num3>num4) {
			if(num3>num2) {
				if(num3>num1)
					System.out.println("The Greatest Value is:"+num3);	
			}
		}
			
			else
				System.out.println("The Greatest Value is:"+num4);
		
		/**
		 * Write a Java program to test a number is positive or negative.
		 */
		
		int value = -11;
		if(0>value)
			System.out.println(value+ " is a negative value");
		else
			System.out.println(value+ " is a positive value");
		
		/**
		 * WAP to check number is odd or even using If - Else
		 */
		int number = 13;
		if(number % 2 == 0)
			System.out.println(number+ " is an even number");
		else
			System.out.println(number+ " is an odd number");
		
		/**
		 * WAP to check given alphabet character is Vowel or Consonant using Switch - Case
*/
		
		String Alphabate = "G";
		switch (Alphabate.toUpperCase()) {
		case "A":
			System.out.println(Alphabate+" is vowel");
			break;
		case "E":
			System.out.println(Alphabate+" is vowel");
			break;
		case "I":
			System.out.println(Alphabate+" is vowel");
			break;
		case "O":
			System.out.println(Alphabate+" is vowel");
			break;
		case "U":
			System.out.println(Alphabate+" is vowel");
			break;

		default:
			System.out.println(Alphabate+" is Consonent");
			break;
		}
		
		/**
		 * WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case
		 */
		
		String Environment = " UAT ";
		switch (Environment.trim()) {
		case "QA":
			System.out.println("This is an QA env");
			break;
		case "Stage":
			System.out.println("This is a Stage env");
			break;
		case "Dev":
			System.out.println("This is a Dev env");
			break;
		case "UAT":
			System.out.println("This is an UAT env");
			break;
		case "Prod":
			System.out.println("This is a Prod env");
			break;

		default:
			System.out.println("Please type a correct env");
			break;
		}
		
		/**
		 * WAP to book the specific type of car from the Uber app using Switch - Case
		 */
		String Uber = "SUV";
		switch (Uber.trim()) {
		case "Mini":
			System.out.println("This is Mini car");
			break;
		case "Sedan":
			System.out.println("This is Sedan car");
			break;
		case "SUV":
			System.out.println("This is SUV car");
			break;
		case "Premium":
			System.out.println("This is Premium car");
			break;

		default:
			System.out.println("Please type a correct car");
			break;
		}
		System.out.println("------------------------------------------------");
		int a = 10;
		int b = 2000;
		int c = 3090;
		int d = 50000;
		if(a>b && a>c && a>d)
			System.out.println("a is the greatest number");
		else if(b>c && b>d)
			System.out.println("b is the greatest number");
		else if(c>d)
			System.out.println("c is the greatest number");
		else
			System.out.println("d is the greatest number");
		
		
		/**
		 * WAP to launch browsers using If-ElseIf and Switch Case.
		 * 
		 * 
		 */
		System.out.println("--------------------------------Switch-Case---------------------------------");
		String Browser = "firefox";
		switch (Browser.toUpperCase().trim()) {
		case "CHROME":
			System.out.println("This is " +Browser);
		case "FIREFOX":
			System.out.println("This is " +Browser);
			break;
		case "IE":
			System.out.println("This is " +Browser);
			break;
		case "Safari":
			System.out.println("This is " +Browser);
			break;

		default:
			System.out.println("Please type a correct Browser");
			break;
			
			
		}
		System.out.println("--------------------------------Switch-Case---------------------------------");
		
		
		String BrowserSite= "  oIE ";
		if(BrowserSite.trim().equals("Firefox")) {
			System.out.println("Firefox");
			
		}
		else if(BrowserSite.trim().equals("Chrome"))
			System.out.println("Chrome");
		else if(BrowserSite.trim().equals("IE"))
			System.out.println("IE");
		else if(BrowserSite.trim().equals("Safari"))
			System.out.println("Safari");
		
		else
			System.out.println("Please type a correct Browser");
		
		System.out.println("------------------------------------------------------------------------------");		
		
		/**
		 * WAP to define the interest rate on the basis of Loan type using Switch Case

			Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
			
			For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan
		 */
		
		String LoanType = "Housing Loan";
		float interestRate = 0.2f;
		double Salary = 6000;
		switch (LoanType) {
		case "Car Loan":
			interestRate = 4.7f;
			
			break;
		case "Housing Loan":
			if(Salary < 35000)
			
				System.out.println("NOT APPLICABLE FOR Housing Loan");
			break;
		case "Personal Loan":
			interestRate = 6.9f;
			break;
			
		case "Education Loan":
			interestRate= 0.9f;
			break;
		default:
            System.out.println("Invalid loan type");
            break;
		}
		
	}
	
	
	
	
}


