package constractorconcept;

import java.util.Arrays;

public class LaptopShop {
	
	String devices[];
	
	
	public LaptopShop(String[] devices) {
		//super();
		this.devices = devices;
		
	}
	public String[] getDevices() {
		String arr [] = devices;
		return arr;
	}
	public int count() {
		int sum = devices.length;
		return sum;
		
	}
	
	public static void main (String[] args) {
		String d[] = {"lenovo","Asus","Hp","Dell","Mac"};
		LaptopShop obj = new LaptopShop(d);
		String alldevices[] = obj.getDevices();
		System.out.println(Arrays.toString(alldevices));
		int total = obj.count();
		System.out.println(total);
		
		
	}
	

}
