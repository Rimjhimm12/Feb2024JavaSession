package javasessions;

public class ClassAndObjectAssignments2 {
	
	String title;

	String author;

	int pageCount;

	 

	public static void main(String[] args) {
		/**Assignment 2:

Define a class named Book with the following attributes:

String title

String author

int pageCount

 int totalBooks (to keep track of the total number of books)

In the main method:

Create three Book objects and initialize their properties with different values.

Print the details of each book and the total number of books.

Modify the pageCount attribute of one book and print the updated details.

Create another Book object and update the total number of books.

Print the details of the new book and the updated total number of books.

*/
		int totalBooks=0;
		
		ClassAndObjectAssignments2 book1 = new ClassAndObjectAssignments2();
		book1.title = "IKIGAI";
		book1.author = "Héctor García ";
		book1.pageCount = 360;
		totalBooks++;
		
		ClassAndObjectAssignments2 book2 = new ClassAndObjectAssignments2();
		book2.title = "India's wars";
		book2.author = "Arjun Subramaniam";
		book2.pageCount = 1234;
		totalBooks++;
		
		ClassAndObjectAssignments2 book3 = new ClassAndObjectAssignments2();
		book3.title = "Holy Bible";
		book3.author = "Moses";
		book3.pageCount = 12040;
		totalBooks++;
		
		System.out.println("Details of the Book1 are: \n Book Name = "+book1.title+"\n Author Name = "+book1.author+"\n Page Count = "+book1.pageCount);
		System.out.println();
		System.out.println("Details of the Book1 are: \n Book Name = "+book2.title+"\n Author Name = "+book2.author+"\n Page Count = "+book2.pageCount);
		System.out.println();
		System.out.println("Details of the Book1 are: \n Book Name = "+book3.title+"\n Author Name = "+book3.author+"\n Page Count = "+book3.pageCount);
		System.out.println();
		System.out.println("Sum of all Books: "+totalBooks);
		System.out.println();
		
		book1.pageCount = 3060;
		System.out.println("Details of the Book1 are: \n Book Name = "+book1.title+"\n Author Name = "+book1.author+"\n Page Count = "+book1.pageCount);
		System.out.println();
		
		ClassAndObjectAssignments2 book4 = new ClassAndObjectAssignments2();
		book4.title = "The Great Gatsby";
		book4.author = "F. Scott Fitzgerald";
		book4.pageCount = 8204;
		totalBooks++;
		System.out.println("Details of the Book1 are: \n Book Name = "+book4.title+"\n Author Name = "+book4.author+"\n Page Count = "+book4.pageCount);
		System.out.println();
		System.out.println("Sum of all Books: "+totalBooks);




	}

}
