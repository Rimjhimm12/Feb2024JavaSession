package OOPsEncaptulation;

public class Teachers {
	
	private void teachersAddress() {
		System.out.println("Teachers address");
	}
	private  int teachersAddress(int a) {
		System.out.println("Teachers address" + a);
		return a;
	}
	private static void teachersAddress(int a, int b) {
		System.out.println("Teachers address" + a+ b);
		
	}
	private String newTeacher(String name) {
		System.out.println("New teacher name is: "+name);
		return name;
	}
	
	public static  void replaceTeacher() {
		Teachers tech = new Teachers();
		//teachersAddress();
		tech.teachersAddress(56);
		teachersAddress(10, 34);
		tech.newTeacher("Rim");
	}

}
