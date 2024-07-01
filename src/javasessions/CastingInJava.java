package javasessions;

public class CastingInJava {

	public static void main(String[] args) {
		/* Write a Java program that demonstrates widening casting. 
		Create variables of different data types such as int, float, double, etc. 
		Assign values to them and then cast them to a higher data type. 
		Finally, print out the original and casted values to observe widening casting in action.*/
		
		int num = 100000;
		int num1 = 1200000000;
		long totalValue= (num + num1);//widening to int;
		System.out.println(totalValue);
		double totalValue1 =totalValue/2.0;
		System.out.println(totalValue1);
		System.out.println((float)totalValue1);
		
		/* Write a Java program that demonstrates widening casting. 
		Create variables of different data types such as int, float, double, etc. 
		Assign values to them and then cast them to a higher data type. 
		Finally, print out the original and casted values to observe widening casting in action.*/
		
		long myLongValue = 12345678901787098L;

		int myIntFromLong = (int) myLongValue;
		System.out.println(myIntFromLong);
		
		int myValue = 12345;
		byte myValueByte = (byte) myValue;
		System.out.println(myValueByte);
		char ch= 'A'+' ';
		int chChar= ch;
		System.out.println(chChar);
		
	}

}
