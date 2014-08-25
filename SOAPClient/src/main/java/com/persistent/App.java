package com.persistent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BookImplService bookImplService = new BookImplService();
        BookImpl bookImpl = bookImplService.getBookImplPort();
        bookImpl.addBook("My Book", "NN");
        bookImpl.addBooksOps();
        bookImpl.getBooks();
        /*try {
			System.out.println(bookImpl.getBookAuthor("My Book"));
			//System.out.println(bookImpl.getBookAuthor("My Book1"));
		} catch (CustomException_Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
	}*/
        
    }
}
