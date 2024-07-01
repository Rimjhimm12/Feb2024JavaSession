package javasessions;

public class Util {
	
	String name;
	int age;
	static  String compName = "Google";
	
	public void getInfo() { //non static method
		System.out.println("get info");
		System.out.println(compName);
		name = "Rimjhim Mallick";
		System.out.println(name);
		
	}
	
	public static void sendMail() {// static method 
		
		System.out.println("Send mail");
		System.out.println(Util.compName);
		Util u= new Util();
		u.name = "kaushik mandal";
		System.out.println(u.name);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Util u= new Util();
		// creating object to access non-ststic method and ver
		
		
		//how to access non static var and method
		//u.name = "Rimjhim";
		//u.age = 28;
		u.getInfo();
		//System.out.println(u.name);
		
		// Using class name we can access static var and method
		Util.sendMail();
		//Utli1.main(args);
		System.out.println("Util-main");
		
		
		
		

	}

}
