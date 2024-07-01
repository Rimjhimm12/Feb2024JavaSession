package WebDriver_Arch_interface;

public interface WebDriver extends SearchIndex {
	
	public void findElement(String name);
	public void findElements(String name);
	
	public void get(String url);
	
	public void getTitle();
	
	public void click(String element);
	
	public void sendKey(String element, String value);
	
	public void close();
	
	
	


}
