package ConditionalsCases;

import javax.security.auth.Subject;

public class programOfPassFail {

	public static void main(String[] args) {
		
/**
 * Write a program to find out whether a student is pass or fail;
 *  if it requires a total of 40% and at least 33% in each subject 
 *  to pass. Assume 3 subjects and take marks as input from the user.
 * 
 * */
//		String subName[] = {"Math","English","Science"};
//		float subject[] = new float[3];
//		subject[0] = 40;
//		subject[1] = 31;
//		subject[2] = 45;
//		int count=-1;
//		float total = (((subject[0]+ subject[1]+ subject[2])/300)*100);
//		
//		if (total >= 40.0) {
//			for(int j =0; j<=subName.length-1;j++) {
//			for(int i =0; i<=subject.length-1;i++) {
//				if(((subject[i]/100)*100)>=33.0) {
//					
//					}
//				
//				}
//			count++;
//			System.out.println(subName[j]+" = "+(subject[count]/100)*100+"%");
//			}
//			System.out.println("Result is pass");
//			
//		}
//			else
//			System.out.println("Student is fail");
	
		int sub1, sub2, sub3;
		sub1 = 63;
		sub2 = 34;
		sub3 = 45;
		int total = sub1+sub2+sub3;
		float percentage = (total/300)*100;
		if(percentage>=40.0) {
			if(sub1>=33 && sub2>=33) {
				if(sub3>=33)
				System.out.println("all subjects are above 33%");
			}
			System.out.println("passed");
		}
		
		else
			System.out.println("at least one subjects is less then 33%....Fail");
			
		
			

	}
}
