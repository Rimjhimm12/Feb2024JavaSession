package OOPsEncaptulation;

public class EcommerceTest {

	public static void main(String[] args) {
		Ecommerce obj = new Ecommerce();
		obj.login("rimjhim", "Rimjhim@123")
				.search("maxkbook")
					.search("macbook", 124000)
						.search("macbook", 123456, "white")
						  .payment("rimjhim@12@okicici.0k")
						  	.payment("icici", 123)
						  		.logout();
		
		System.out.println();
		obj.login("rimjhim", "Rimjhim@123")
			.search("maxkbook")
				.search("macbook", 124000)
				  	.logout();

	}

}
