package javasessions;

public class AssignmentOfClassAndObj {
	
	String stdName;
	int stdRoll;
	String stdClass;
	int age;

	public static void main(String[] args) {
		/*Create two Student objects and initialize their properties.

Print the details of each student and the total number of students.

Modify the age of one student and print the updated details.

Create another Student object and update the total number of students.

Print the details of the new student and the updated total number of students.*/
		
		int totalStudents =0;
		
		AssignmentOfClassAndObj student1 = new AssignmentOfClassAndObj(); // First student obj
		student1.stdName = "Rohan";
		student1.stdRoll = 4;
		student1.stdClass = "iv";
		student1.age = 12;
		totalStudents++;
		
		AssignmentOfClassAndObj student2 = new AssignmentOfClassAndObj();//Second Student obj
		student2.stdName = "Arti";
		student2.stdRoll = 8;
		student2.stdClass = "v";
		student2.age = 13;
		totalStudents++;
		
		System.out.println("Detials of Student1:\n Name = "+student1.stdName+ "\n Roll = " +student1.stdRoll+ "\n Class = "+student1.stdClass+"\n Age = "+student1.age);
		System.out.println("Detials of Student2:\n Name = "+student2.stdName+ "\n Roll = " +student2.stdRoll+ "\n Class = "+student2.stdClass+"\n Age = "+student2.age);
		System.out.println("Total number of Students are: "+ totalStudents);// Total number of students
		
		student1.age =14;
		System.out.println("Updated age of the Student is: "+student1.age);
		System.out.println("Detials of Student1:\n Name = "+student1.stdName+ "\n Roll = " +student1.stdRoll+ "\n Class = "+student1.stdClass+"\n Age = "+student1.age);


		AssignmentOfClassAndObj student3 = new AssignmentOfClassAndObj(); // Creating another object
		student3.stdName = "Sara";
		student3.stdRoll = 9;
		student3.stdClass = "iv";
		student3.age = 14;
		totalStudents++;
		
		System.out.println("Total number of Students are: "+ totalStudents);// Total number of students after adding a new student

		System.out.println("Detials of Student3:\n Name = "+student3.stdName+ "\n Roll = " +student3.stdRoll+ "\n Class = "+student3.stdClass+"\n Age = "+student3.age);

	}

}
