package com.persistent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;




import com.persistent.errors.CustomException;
import com.persistent.errors.ErrorBean;
import com.persistent.model.Book;

@WebService
public class BookImpl {
	private List<Book> books=new ArrayList<Book>();
	@WebMethod(operationName="addBooksOps")
	public void addBooks()
	{
		books.add(new Book("biography","nishant"));
		books.add(new Book("dreams","niranjan"));
	}
	@WebMethod
	public void getBooks()
	{
		Iterator<Book> itr = books.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	@WebMethod
	public void addBook(@WebParam(name="Book_Name") String name, String author)
	{
		books.add(new Book(name,author));
	}
	@WebMethod
	@WebResult(name="Book_Author_Name")
	public String getBookAuthor(@WebParam(name ="Book_Name") String name) throws CustomException
	{
		Iterator<Book> itr = books.iterator();
		Book book=null;
		while(itr.hasNext())
		{
			book= itr.next();
			if(name.equalsIgnoreCase(book.getTitle()))
			{
				return book.getAuthor();
			}
		}
		throw new CustomException(new ErrorBean(-999,"Book Not Found"));
	}
	

}
