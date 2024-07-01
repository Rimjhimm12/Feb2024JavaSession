package OOPInterface;

public class TestCollages {

	public static void main(String[] args) {
		
		JISCollage jis = new JISCollage();
		
		jis.bioMedicalEng();
		jis.computerScienceEng();
		jis.electronicAndComunicationEng();
		jis.informationTechnologyEng();
		jis.terminal2();
		jis.terminal1();
		jis.scholarship();
		jis.studentMS();
		
		
		System.out.println("--------------");
		
		//top casting
		UKUniversity uk = new JISCollage();
		uk.bioMedicalEng();
		uk.electronicAndComunicationEng();
		uk.studentMS();
		
		TechnoIndiaCollage techno = new TechnoIndiaCollage();
		techno.FinalSem();
		techno.terminal1();
		techno.computerScienceEng();
		techno.informationTechnologyEng();
		techno.studentMS();
		techno.scholarship();
		
		
		
	}

}
