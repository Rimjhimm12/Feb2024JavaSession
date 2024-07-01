package OOPAbstract;

public class Pagetest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage(12,23);
		Page.displayLogo();
		LoginPage.displayLogo();
		lp.doLogin("rim", "rim123");
		lp.getPageInfo();
		lp.title();
		lp.url();
		
		
		System.out.println("----------------------------------");
		
		Page p = new LoginPage(12, 12);
		p.title();
		p.url();
		p.getPageInfo();
		
		
	
		

		
		
	}

}
