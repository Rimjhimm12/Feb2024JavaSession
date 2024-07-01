package constractorconcept;

public class Employee {
	
	String name;
	int age;
	double salary;
	static String compName = "EY";
	
	public Employee(String name, int age)
	{
		this.name = name;
		this.age = age;
		
	}
	
	public Employee(double salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
		
	}
	

	public Employee(String name, int age, double salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public static void main(String[] args) {
		Employee emp = new Employee("Rimjhim Mallick", 28, 130000);
		System.out.println("Name: "+emp.name+" Age: "+emp.age+" Salary: "+emp.salary+ "Company Name: "+compName);
		
		Employee emp1 = new Employee("tom", 23);
		System.out.println(emp1.name);
		System.out.println(emp1.age);
		emp1.age = 27;
		System.out.println(emp1.age);
		
		Employee emp2 = new Employee(23000);
		System.out.println(emp2.name);
		System.out.println(emp2.age);
		System.out.println(emp2.salary);
		
		
		School s1 = new School("rim", 1234, 3457890);
		System.out.println(s1.nos);
		
		
		

	}

}
