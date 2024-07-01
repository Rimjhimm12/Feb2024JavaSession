package javasessions;

public class DataTypes {

	public static void main(String[] args) {
		// Data types has 3 families: 
		// Numbers, characters, and boolean 
		//In java we have total 8 primitive types of data types present. Which are not real type object. Hence java is not 100% OOPs language;
		// Primitive data: Where storage size is fixed, and we do not use this while object creation.
		//Numbers types: Byte(1byte = 8bites), short, int, long;
		//byte holds 1byte 
		byte b1 = 10;// store 1 byte memory
		System.out.println(b1);//10
		short s1 = 456;//store 2 bytes memory
		System.out.println(s1);//456
		int i1 = 12809909;// store 4 bytes  memory
		System.out.println(i1);//12809909
		long l1 =23433445545667l;// store 8 bytes  memory
		System.out.println(l1);//23433445545667
		float f1 = 1.23f;//store 4 bytes  memory
		System.out.println(f1);//1.23
		double d1 = 24.6d;// store 8 bytes  memory
		System.out.println(d1);//24.6
		//char stores 2 bytes memory for some special characters. It supports ASCII values;
		 // char uses for single value to store
		char c1 = 'a'; // supports from a to z
		System.out.println(c1);//a
		System.out.println((byte) c1);//97
		char c2 = 'H';//Supports from A to Z
		System.out.println(c2);//H
		System.out.println(c1 + c2);//97 + 72 = 169
		System.out.println((char)33);//!
		boolean a = true; // holds 1bit memory
		System.out.println(a);
		boolean b = false;
		System.out.println(b);
		
		System.out.println(12/2);//6
		System.out.println((float)12/2);//6.0
		System.out.println(11.0/2.0);//5.5
		System.out.println(0/1);//0
		System.out.println(0.0/0.0);//NaN
		System.out.println(0/0.0);//NaN
		System.out.println(0.0/0);//NaN
		System.out.println(12.8/0);//infinity
		System.out.println(12.8/0.0);//infinity
		//System.out.println(12/0);//Arithmetic Exception 
		System.out.println(12/0.0);//infinity
		//System.out.println(0/0);//AE
		
	
		
		
		
	
		
		
		
		

	}

}
