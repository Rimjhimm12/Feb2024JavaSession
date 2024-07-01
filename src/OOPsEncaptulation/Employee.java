package OOPsEncaptulation;

public class Employee {
	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	// public getter/setter
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
	return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	private String empName() {
		 String eName = "Employee name";
		 return eName;
	}
	private String empAddress() {
		String eAddress = "Barrackpore";
		 return eAddress;
	}
	private int empCount() {
		 int seniorEmp = 56;
		 int NewEmp = 3;
		 return (seniorEmp+NewEmp);
	}
	public  void empInfo() {
		//Employee emp = new Employee();
		System.out.println(empName());
		System.out.println(empAddress());
		System.out.println(empCount());
	}
	
	
	
}
