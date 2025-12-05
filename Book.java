package ph.com.bpi.helloworld;

public class Book {	
		
	String Bookname;
	String Bookcolor;
	String Bookauthor;
	
	 public static void main(String[] args) {
	 Book mybook = new Book();
	 mybook.Bookname = "Harry Potter";
	 mybook.Bookcolor = "Blue";
	 mybook.Bookauthor = "J.K Rowling";
	 System.out.println("Book title is " + mybook.Bookname);
	 System.out.println("Book color is " + mybook.Bookcolor);
	 System.out.println("Book author is " + mybook.Bookauthor);
		
	}
	
}