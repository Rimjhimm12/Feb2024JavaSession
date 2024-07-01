package callbyreferance;

public class CallRefe {
	
	String accountNumber;
	String cvv;
	String name;
	int salary;
	static String icfcCode = "0123ICICI";
	
	public int montlySalary(CallRefe t1) {
		
		if(t1.name == "rim") {
		System.out.println("Salary is "+t1.salary);
		int hike = salary+ 1000;
		System.out.println("total raise is ");
		return hike;
		}
		else {
			System.out.println("incorrect account holder name  ....."+name);
			return 0;
		}
			
		
		
	}
	
	public static void cvv(CallRefe t2) {
		System.out.println(t2.montlySalary(t2));
		if(t2.name == "rim")
		System.out.println("CVV number is "+t2.cvv);
		else
			System.out.println("CVV number is invalid");
			
		
	}
	
	public static void main(String[] args) {
		CallRefe obj = new CallRefe();
		obj.accountNumber ="5640986666";
		obj.name = "rim";
		obj.salary = 123457;
		obj.cvv = "234";
		//obj.montlySalary(obj);
		CallRefe.cvv(obj);
		
		
	}
			

}
