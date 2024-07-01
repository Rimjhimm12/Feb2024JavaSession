package WebDriver_Arch_interface;

public class FireFoxDriver implements WebDriver {

	@Override
	public void findElement(String name) {
		System.out.println("FF---Find element --"+name);
		
	}

	@Override
	public void findElements(String name) {
		System.out.println("FF-Find elements --"+name);
		
	}

	@Override
	public void get(String url) {
		System.out.println("CD---get url--"+url);
		
	}

	@Override
	public void getTitle() {
		System.out.println("CD--get title");
		
	}

	@Override
	public void click(String element) {
		System.out.println("CD--clicks"+element);
		
	}

	@Override
	public void sendKey(String element, String value) {
		System.out.println("CD--get send key--" +element + value);
		
	}

	@Override
	public void close() {
		System.out.println("CD--get close");
		
	}

}
