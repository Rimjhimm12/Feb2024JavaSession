package javasessions;

public class Testing {
	
	public void m1() {
		System.out.println("m1 method");
	}
	
	public void m2() {
		
		System.out.println("m2 method");
			Testing.t1();
		}
	
	public void m3() {
		System.out.println("m3 method");
		
	}
	public static void t1() {
		
		System.out.println("t1 method");
		
	}
	public static void t2() {
		
		System.out.println("t1 method");
		
	}
	public static void t3() {
		System.out.println("t1 method");
		
	}
	public static void t4() {
		System.out.println("t1 method");
		
	
	}


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing test = new Testing();
		test.m1();
		test.m2();
		t1();

	}
	

}
