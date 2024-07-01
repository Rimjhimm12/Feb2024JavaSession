package javasessions;

public class MethodOverload {
	
	private void m1(int a, int b, int c) {
		System.out.println(a+" "+b+" "+c);
	}
	private void m1(String a, int b, int c) {
		System.out.println(a+" "+b+" "+c);
	}
	public void methodCalling() {
		m1(12,23, 10);
		m1("rim", 10, 100);
	}

}
