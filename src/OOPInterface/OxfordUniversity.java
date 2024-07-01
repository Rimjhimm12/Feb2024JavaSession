package OOPInterface;

public interface OxfordUniversity {
	public void scholarship();
	
	default void studentMS() {
		System.out.println("OXF----studentMS");
	}

}
