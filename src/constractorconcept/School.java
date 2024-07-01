package constractorconcept;

public class School {
	
	String Sname;
	public int Year;
	private String section = "VIII";
	protected double nos;
	
	
	
	public School(String sname, int year, double nos) {
		//super();
		Sname = sname;
		Year = year;
		this.nos = nos;
		
		
		
	}
	public void a() {
		School sc = new School();
		System.out.println(sc.section);
		int age =10;
		System.out.println(age);
		
	}



	public static void main(String[] args) {
		School sc = new School("fgg", 1234, 45);
		sc.a();
		
	
		
	}
	public School() {
		//super();
	}
	
	
	

}
