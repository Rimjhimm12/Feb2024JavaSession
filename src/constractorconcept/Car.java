package constractorconcept;

import java.util.Arrays;

public class Car {
	String name;
	int price;
	String color;
	String licenseName;
	static String brand = "AirBus" ;
	String devices[];
	
	

	public Car(String name, int price, String color) {
		
		this.name = name;
		this.price = price;
		this.color = color;
	}
	



	public Car(String name, String licenseName) {
		
		this.name = name;
		this.licenseName = licenseName;
	}




	public Car(String name, int price, String color, String licenseName) {
		
		this.name = name;
		this.price = price;
		this.color = color;
		this.licenseName = licenseName;
		
	}
	
	
	public Car(String name, String color, int price) {
		
		this.name = name;
		this.price = price;
		this.color = color;
		
	}




	public Car(String name, String color, String[] devices) {
		
		this.name = name;
		this.color = color;
		this.devices = devices;
	}
	
	public String[] deviceList() {
		
		return devices;
	}
	
	
	public int deviceCount() {
		
		return devices.length;
	}
	
	
	
	
	
	



}
