package constractorconcept;

import java.util.Arrays;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car("BMW", 0, "White");
		System.out.println("Name: "+car1.name+" Price: "+car1.price+" Color: "+car1.color);
		car1.price= 3000000;
		System.out.println("Name: "+car1.name+" Price: "+car1.price+" Color: "+car1.color);
		
		
		Car car2 = new Car("Lamborgini", 2000000000, "Yellow");
		System.out.println("Name: "+car2.name+" Price: "+car2.price+" Color: "+car2.color+" Brand: "+Car.brand);
		
		
		Car car3 = new Car(null, 0, null);
		System.out.println(Car.brand);
		
		Car car4 = new Car("Alto", null);
		System.out.println(car4.name+" "+Car.brand);
		
		
		String arr[] = {"ABC", "DEF","XYZ"};
		Car car5 = new Car(null, null, arr);
		//System.out.println(Arrays.toString(car5.devices));
		//System.out.println(arr.length);
		
		String newArr = Arrays.toString(car5.deviceList());
		System.out.println(newArr);
		int count = car5.deviceCount();
		System.out.println(count);
		
		//Browser br = new Browser();
		//br.close();
	}
	

	
		
	}

