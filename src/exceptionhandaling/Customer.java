package exceptionhandaling;

public class Customer{
	
	
	
	
	public void m1() {
		System.out.println("m1");
		m2();
		
	}
	
	public void m2() {
		System.out.println("m2");
		try {
		m3();
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		}
		
	}
	public void m3() throws ArithmeticException {
		System.out.println("m1");
		int i = 9/0;
		
	}

	public static void main(String[] args) {
		Customer c = new Customer();
		c.m1();
//		try {
//			int i = 9/0;
//		}
//		catch (ArithmeticException e) {
//			System.out.println("AE is commimg");
//			e.printStackTrace();
		String data = null;
//		}
//		if(data == null)
//		{
//		String j = data;
//		throw new MyException("AE here");
//		}
//		System.out.println("ASSSSSSSSS");
		
		int i =10;
		i = i+10;
		System.out.println(i+10);//30
		System.out.println(i);//20
		int j = i+i;
		
		System.out.println(j);//40
		
		String name = "Rim";
		System.out.println(name);//Rim
		System.out.println(name+"i");//Rimi
		System.out.println(name);//Rim
		name = name+"s";
		
		System.out.println(name);//Rims
		

	}

}
