package OOPAbstract;

public class LoginPage extends Page {
	
//	public LoginPage() {
//		System.out.println("LP----default constractor");
//	}
	
	public LoginPage(int a, int b) {
		System.out.println("LP---- constractor"+a+" "+b);
	}

	@Override
	public void title() {
		System.out.println("LP----title");
		
	}

	@Override
	public void url() {
		System.out.println("LP----url");
		
	}
	
	public void doLogin(String un, String pwd ) {
		System.out.println("User is logged in"+un+pwd);
	}
	
	
@Override	
	public void getPageInfo() {
		System.out.println("page=---getPageInfo");
		//billing();
	}




}
