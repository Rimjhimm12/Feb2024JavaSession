package constractorconcept;

import java.util.Arrays;

public class CallByRef {
	String name;
	int age;
	
	public void test1(CallByRef t2)
	{
		t2.name = "Giko";
		t2.age = 38;
		System.out.println(t2.name);// KoKo
		System.out.println(t2.age);
		
		
	}
	
	public static void test(CallByRef t1)
	{
		//System.out.println("test method");
		t1.name = "KoKo";
		t1.age = 33;
		System.out.println(t1.name);
		System.out.println(t1.age);
	}
	public void test2(CallByRef t3) {
		
		t3.name = "MoMo";
		t3.age = 13;
		System.out.println(t3.name);
		System.out.println(t3.age);
		 String aa = "1234 4567 5678";
		System.out.println(aa);
	}
	
	

	public static void main(String[] args) {
		
		
		CallByRef obj = new CallByRef();
		obj.name = "Jhon";
		obj.age = 23;
		System.out.println(obj.name);// Jhon
		System.out.println(obj.age);//23
		test(obj);//KoKo, 33
		System.out.println();
		
		obj.test1(obj);// Giko, 38
		System.out.println();
		obj.test2(obj);//MoMo,  13
		
		

	}

	

}
