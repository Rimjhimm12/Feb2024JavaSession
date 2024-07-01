package javakeyword;

public class Employee {
	
	
	
	String empName;
	String empID;
	int empAge;
	public Employee() {
		//this("Rimjhim", "AB0087", 23);
		System.out.println("Default constructor");
		this.empInfo();
	}
	public Employee(String empName) {
		this();
		this.empName = empName;
		System.out.println("one parameterise constructor "+empName);
		
	}
	public Employee(String empName, String empID, int empAge) {
		
		this("kiki");
		
		this.empName = empName;
		this.empID = empID;
		this.empAge = empAge;
		
		System.out.println("3 parameterise constructor"+ empName+ " "+empID+" "+empAge);
		
		
	}
	
	public void empInfo()
	{
		System.out.println("Employee name is "+this.empName);
	}
	
	
	
	
	
	
	
	
	
	

}
