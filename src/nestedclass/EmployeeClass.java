package nestedclass;

public class EmployeeClass {
	
	public int sum() {
		System.out.println("Sum of the total number is: ");
		int a = 12;
		int b = 23;
		int sum =a+b;
		System.out.println(sum+100);
		System.out.println("add of two numbers is ");
		return sum;
	}
	
	public int sum(int a, int b) {
		System.out.println("Sum of the total number is---: ");
		int sum =a+b;
		return sum;
	}

	public static void main(String[] args) {
		EmployeeClass emp1 = new EmployeeClass();
		int add = emp1.sum();
		System.out.println(add);
		
		System.out.println(emp1.sum(23, 45));
		int total = emp1.sum(23, 45);
		System.out.println(total+100);
		

	}

}
