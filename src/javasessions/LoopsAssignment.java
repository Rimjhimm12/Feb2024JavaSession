package javasessions;

public class LoopsAssignment {

	public static void main(String[] args) {
		// Print A-Z , a-z, 0-9 with the respective ASCII numbers the console one using while, do-while and for loop.
		
		char charASCII = 'A';
		while (charASCII<='Z') {
			System.out.println(charASCII+" = "+(byte)charASCII);
		    charASCII++;
		}
		
		System.out.println("--------------------------------------------------------------------------------------");
		char charASCIISmall = 'a';
		do {
			System.out.println(charASCIISmall+" = "+(byte)charASCIISmall);
			charASCIISmall++;
		} while (charASCIISmall<='z');
		
		System.out.println("--------------------------------------------------------------------------------------");

		for(byte numASCII = 0;numASCII<=9;numASCII++)
			System.out.println(numASCII+" = "+(byte)numASCII);
		
	}

}