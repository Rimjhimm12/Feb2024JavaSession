package exceptionhandling;

public class Customer {
	String name;

	public static void main(String[] args) {
		
		Customer obj = new Customer();
		obj = null;
		
		int a[] = { 1, 2, 3,4};
 		System.out.println("Printing A");
		try {
			System.out.println(a[4]);
			obj. name = "rim";
			int i = 9/0;
			
			
		} 
		
	catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("AIUOB Exception is coming");
			e.printStackTrace();
			}
			catch (NullPointerException e) {
						
						System.out.println("null pointer Exception is coming");
						e.printStackTrace();
					}
					
			catch (ArithmeticException e) {
			
			System.out.println("Arithmetic Exception is coming");
			e.printStackTrace();
		}
			catch (Exception e) {
						
						System.out.println("any Exception is coming");
						e.printStackTrace();
					}
		
		
				System.out.println("bye");

	}

}
