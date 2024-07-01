package javasessions;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		
		String empName[] = new String[5];
		empName[0] = "Rimjhim";
		empName[1] = "Kaushik";
		empName[2] = "Khushi";
		empName[3] = "Oscar";
		empName[4] = "Ankita";
		System.out.println(empName.length);
		//System.out.println(empName[0]);
		
		System.out.println(Arrays.toString(empName));
		
		for(String e : empName) {
			System.out.println(e);
		
			if(e.equals("Oscar")) {
				System.out.println("Most cutest member");
			}
			else if(e.equals("Ankita")) {
				System.out.println("Best Sona Sister");
			}
			switch (e) {
			case "Khushi":
				System.out.println(empName[2]+" is my cute Sister");
				break;


			}
			
		
		}
		
		System.out.println("------------------------------------------------");
		 Object ob[] = new Object[5];
		 ob[0] = 123456;
		 ob[1] = "Rimjhim Mallick";
		 ob[2] = 'F';
		 ob[3] = 61000.67;
		 ob[4] = true;
		 
		 System.out.println(ob.length);//5
		 System.out.println(Arrays.toString(ob));
		 
			System.out.println("------------------------------------------------");
			
			int num[] = new int[5];
			num[0]= 100;
			num[1]= 300;
			num[2]= 600;
			num[3]= 700;
			num[4]= 900;
			System.out.println(num[0]/2);
			int j =0;
			for(int i=0;i<=num.length-1;i++) {
				//400
				j=j+num[i];//400+600
				
						
				/**if(num[i]%2 != 0)
					System.out.println(num[i]+" is an odd number");
			
				else
				System.out.println(num[i]+" is an even number");*/
				
				
				

				
			}System.out.println(j);
			
	}

}
