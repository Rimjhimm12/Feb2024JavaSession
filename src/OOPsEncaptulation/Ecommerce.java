package OOPsEncaptulation;

public class Ecommerce {
	
	public Ecommerce login() {
		System.out.println("Login page loaded....");
		return this;
	}
	public Ecommerce login(String userName, String password) {
		System.out.println("Login in the portal....");
		return this;
	}
	public Ecommerce search(String productName) {
		System.out.println("macBook....");
		return this;
	}
	public Ecommerce search(String productName, double price) {
		System.out.println("macBook...1000000");
		return this;
	}
	public Ecommerce search(String productName, double price, String color) {
		System.out.println("macBook...1000000....white");
		return this;
	}
	public Ecommerce payment(String upi) {
		System.out.println("upi");
		return this;
	}
	public Ecommerce payment(String card, int cvv ) {
		System.out.println("payment done");
		return this;
	}
	public Ecommerce logout() {
		System.out.println("Logout ....");
		return this;
	}
	
	

}
