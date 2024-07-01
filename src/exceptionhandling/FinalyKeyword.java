package exceptionhandling;

public class FinalyKeyword {

	public static void main(String[] args) {
		try {
			int i = 9/0;
		} catch (ArithmeticException e) {
			System.out.println("AE is coming");
			
		}
		
		System.out.println(10);
		System.out.println(10+10);
		

	}

}
