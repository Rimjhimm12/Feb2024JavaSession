package OOPAbstract;

public abstract class Page {
	
	public abstract void title();
	public abstract void url();
	
	public static final void displayLogo() {
		System.out.println("page=---display Logo");
	}
	
	public void getPageInfo() {
		System.out.println("page=---getPageInfo");
		billing();
	}
	
	public Page() {
		System.out.println("page----default constractor");
	}
	
//	public Page(int a, int b) {
//		System.out.println("page---- constractor "+a+" "+b);
//	}

	
	private void billing() {
		System.out.println("page----billing");
	}
	

}
