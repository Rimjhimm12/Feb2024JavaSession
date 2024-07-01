package OOPsEncaptulation;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Rimjhim");
		System.out.println(emp.getName());
		emp.empInfo();
		
		System.out.println(9/0);
	}

}
