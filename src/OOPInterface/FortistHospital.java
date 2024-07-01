package OOPInterface;

public class FortistHospital implements USMedical, UKMedical, IndianMedical {

	static final int MIN_FEE =100;
	//individual Methods
	public void medicalServices() {
		System.out.println("FH--medicalServices");
	}
	
	public void otdServices() {
		System.out.println("FH--otdServices");
	}
	//US

	@Override
	public void physioServices() {
		System.out.println("FH--physioServices");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH--oncologyServices");
		
	}

	

	@Override
	public void emergencyServices() {
		System.out.println("FH--emergencyServices");
		
	}
	
	//UK

	@Override
	public void gynoServices() {
		System.out.println("FH--gynoServices");
		
	}

	@Override
	public void gastoServices() {
		System.out.println("FH--gastoServices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("FH--dentalServices");
		
	}

	@Override
	public void pdioServices() {
		System.out.println("FH--pdioServices");
		
	}

	@Override
	public void pdioServices(int a) {
		System.out.println("FH--pdioServices"+a);
		
	}
	
	public static void billing() {
		System.out.println("FH---billing");
	}
	
	@Override
	public void helpDesk() {
		System.out.println("FH---helpDesk");
	}

	
	
}
