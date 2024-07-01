package javasessions;

public class ClassAndObjectAssignment3 {
	String brand;
    String model;
    int year;

	public static void main(String[] args) {
		 // Assignments:
        // 1. Assign car1 to car2
        // 2. Assign car2 to car3
        // 3. Assign car3 to car4
        // 4. Assign car4 to car1


        // Print the values of car1, car2, car3 and car4 after each assignment
		
		ClassAndObjectAssignment3 car1 = new ClassAndObjectAssignment3();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2020;

        ClassAndObjectAssignment3 car2 = new ClassAndObjectAssignment3();
        car2.brand = "Honda";
        car2.model = "Accord";
        car2.year = 2019;

        ClassAndObjectAssignment3 car3 = new ClassAndObjectAssignment3();
        car3.brand = "Ford";
        car3.model = "Fusion";
        car3.year = 2018;

        ClassAndObjectAssignment3 car4 = new ClassAndObjectAssignment3();
        car4.brand = "Audi";
        car4.model = "A6";
        car4.year = 2022;

        System.out.println("Original values:");
        System.out.println(car1.brand + " " + car1.model + " " + car1.year);
        System.out.println(car2.brand + " " + car2.model + " " + car2.year);
        System.out.println(car3.brand + " " + car3.model + " " + car3.year);
          System.out.println(car4.brand + " " + car4.model + " " + car4.year);


        System.out.println("----------");
        
        car2 =car1; //result car1
        System.out.println(car1.brand + " " + car1.model + " " + car1.year);
        System.out.println(car2.brand + " " + car2.model + " " + car2.year);
        //car3 = car2;//result car1
        
       // car4 = car3;//result car1
        //car1 =car4;//result car1
        

        

	}

}
