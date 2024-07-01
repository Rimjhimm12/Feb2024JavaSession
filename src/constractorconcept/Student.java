package constractorconcept;

public class Student {
	
	String name;
	private int age;
	
	
	
	public Student() {
		//super();
	}

	public Student(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	
	public int reportCard(int sub1, int sub2) {
		Student obj = new Student("Rimjhim mallick", 28);
		System.out.println(obj.name+" "+obj.age);
		int result = sub1+sub2;
		return result;
		
	}
	
	
	
	
}
