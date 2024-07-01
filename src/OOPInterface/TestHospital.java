package OOPInterface;

public class TestHospital {

	public static void main(String[] args) {
		FortistHospital fh = new FortistHospital();
		fh.dentalServices();
		fh.emergencyServices();
		fh.otdServices();
		fh.pdioServices(12);
		System.out.println(USMedical.MIN_FEE);
		//USMedical.MIN_FEE=90;
		System.out.println(UKMedical.MIN_FEE);
		System.out.println(IndianMedical.MIN_FEE);
		System.out.println(FortistHospital.MIN_FEE);
		//FortistHospital.MIN_FEE =90;
		//System.out.println(FortistHospital.MIN_FEE);
		FortistHospital.billing();
		USMedical.billing();
		fh.helpDesk();
		
		
		USMedical us =new FortistHospital();
		us.dentalServices();
		us.emergencyServices();
		us.physioServices();
		us.oncologyServices();
		us.helpDesk();
		
		UKMedical uk =new FortistHospital();
		uk.emergencyServices();
		uk.gastoServices();
		uk.gynoServices();
		
		
		

	}

}
