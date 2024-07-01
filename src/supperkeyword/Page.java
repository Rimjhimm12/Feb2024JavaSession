package supperkeyword;

public class Page {
	
	String name;
	String title;
	
	public Page() {
		
		this("loginpage","amazon");
		System.out.println("default cons...");
	}
	public Page(String name, String title) {
		this("rimjhim");
		System.out.println("2 param cont..");
		System.out.println(name);
		System.out.println(title);
		
	}
	
	public Page(String name) {
		
		System.out.println("1 param cont.."+name);
		
	}

}
