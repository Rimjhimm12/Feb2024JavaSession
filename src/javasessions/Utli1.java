package javasessions;

import java.util.Arrays;

public class Utli1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Util u= new Util();
			
			u.name = "Arnav";
			System.out.println(u.name);
			System.out.println(Util.compName);
			u.getInfo();
			Util.sendMail();
			int a[] = new int[2];
			a[0] =12;
			a[1] = 11;
			
			Utli1.main(a);
			Utli1.main(1227, 675);
			
			Util.main(args);
		

	}
	public static void main(int a, int b) {
		System.out.println(a+b+"hi");
		int a1[] = {3, 4, 6};
		main(a1);
	}
	public static void main(int[] a) {
		System.out.println("Hi"+Arrays.toString(a)+a.length);
	}


}
