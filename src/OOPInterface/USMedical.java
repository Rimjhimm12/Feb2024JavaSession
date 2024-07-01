package OOPInterface;

public interface USMedical {
	
	 int MIN_FEE =60;
	//interface methods can not have methods body
	//abstract method: does not have method body
	public void physioServices();
	
	public void oncologyServices();
	
	public void dentalServices();
	
	public void emergencyServices();
	
	public static void billing() {
		System.out.println("US---billing");
	}
	
	default void helpDesk() {
		System.out.println("US---helpDesk");
	}

}
