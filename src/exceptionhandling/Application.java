package exceptionhandling;

public class Application {
	
	public void m1() {
		System.out.println("M1 mnethod");
		m2();
		
	}
	
	public void m2() {
		System.out.println("M2 mnethod");
		try {
			m3();
			
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("AE is comimg");
		}
		
		
	}

	public void m3() throws ArithmeticException {
		System.out.println("M3 mnethod");
		int i=9/0;
		
	}
	
	

	public static void main(String[] args) {
		Application obj = new Application();
		
		obj.m1();
		System.out.println("bye");

	}

}
