package javasessions;

public class MarkSheet {
	
	public boolean markCalculator(String studentName){
		
		System.out.println("Mark Sheet of "+studentName+" is:");
		boolean flag = true;
		switch (studentName) {
		
		case "Alia":
			System.out.println(studentName+" is Passed");
			break;
			//return true;
		case "Kajol":
			System.out.println(studentName+" is Passed");
			break;
			//return true;
		case "Kiara":
			System.out.println(studentName+" is Passed");
			break;
			//return true;
		case "Sara":
			System.out.println(studentName+" is Passed");
			break;
			//return true;
		default:
			System.out.println("Typo......" +studentName);
			flag = false;
			break;
			//return false;
		}
		return flag;
		
	}

	public static void main(String[] args) {
		MarkSheet obj = new MarkSheet();
		
		if(obj.markCalculator("tom"))
			System.out.println("Go to next level");
		else
			System.out.println("Plesae enter a proper stu name");

	}

}
