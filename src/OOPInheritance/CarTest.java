package OOPInheritance;

import javasessions.MethodOverload;

public class CarTest {

	public static void main(String[] args) {
		BMW obj = new BMW();
		BMW.stop();
		obj.start();
		
		
		obj.refule();
		obj.FM();
		
		Car obj1 = new Car();
		obj1.FM();
		obj1.start();
		
		MethodOverload obj3 = new MethodOverload();
		obj3.methodCalling();
		
		
		

	}

}

