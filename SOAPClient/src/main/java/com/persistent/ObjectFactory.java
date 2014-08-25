
package com.persistent;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.persistent package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddBookResponse_QNAME = new QName("http://persistent.com/", "addBookResponse");
    private final static QName _GetBookAuthorResponse_QNAME = new QName("http://persistent.com/", "getBookAuthorResponse");
    private final static QName _BookException_QNAME = new QName("http://persistent.com/", "Book_Exception");
    private final static QName _GetBooks_QNAME = new QName("http://persistent.com/", "getBooks");
    private final static QName _GetBookAuthor_QNAME = new QName("http://persistent.com/", "getBookAuthor");
    private final static QName _AddBooksOps_QNAME = new QName("http://persistent.com/", "addBooksOps");
    private final static QName _GetBooksResponse_QNAME = new QName("http://persistent.com/", "getBooksResponse");
    private final static QName _AddBooksOpsResponse_QNAME = new QName("http://persistent.com/", "addBooksOpsResponse");
    private final static QName _AddBook_QNAME = new QName("http://persistent.com/", "addBook");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.persistent
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBooks }
     * 
     */
    public GetBooks createGetBooks() {
        return new GetBooks();
    }

    /**
     * Create an instance of {@link GetBookAuthor }
     * 
     */
    public GetBookAuthor createGetBookAuthor() {
        return new GetBookAuthor();
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

    /**
     * Create an instance of {@link GetBookAuthorResponse }
     * 
     */
    public GetBookAuthorResponse createGetBookAuthorResponse() {
        return new GetBookAuthorResponse();
    }

    /**
     * Create an instance of {@link CustomException }
     * 
     */
    public CustomException createCustomException() {
        return new CustomException();
    }

    /**
     * Create an instance of {@link AddBooksOpsResponse }
     * 
     */
    public AddBooksOpsResponse createAddBooksOpsResponse() {
        return new AddBooksOpsResponse();
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link AddBooksOps }
     * 
     */
    public AddBooksOps createAddBooksOps() {
        return new AddBooksOps();
    }

    /**
     * Create an instance of {@link GetBooksResponse }
     * 
     */
    public GetBooksResponse createGetBooksResponse() {
        return new GetBooksResponse();
    }

    /**
     * Create an instance of {@link ErrorBean }
     * 
     */
    public ErrorBean createErrorBean() {
        return new ErrorBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://persistent.com/", name = "addBookResponse")
    public JAXBElement<AddBookResponse> createAddBookResponse(AddBookResponse value) {
        return new JAXBElement<AddBookResponse>(_AddBookResponse_QNAME, AddBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://persistent.com/", name = "getBookAuthorResponse")
    public JAXBElement<GetBookAuthorResponse> createGetBookAuthorResponse(GetBookAuthorResponse value) {
        return new JAXBElement<GetBookAuthorResponse>(_GetBookAuthorResponse_QNAME, GetBookAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://persistent.com/", name = "Book_Exception")
    public JAXBElement<CustomException> createBookException(CustomException value) {
        return new JAXBElement<CustomException>(_BookException_QNAME, CustomException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://persistent.com/", name = "getBooks")
    public JAXBElement<GetBooks> createGetBooks(GetBooks value) {
        return new JAXBElement<GetBooks>(_GetBooks_QNAME, GetBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://persistent.com/", name = "getBookAuthor")
    public JAXBElement<GetBookAuthor> createGetBookAuthor(GetBookAuthor value) {
        return new JAXBElement<GetBookAuthor>(_GetBookAuthor_QNAME, GetBookAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBooksOps }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://persistent.com/", name = "addBooksOps")
    public JAXBElement<AddBooksOps> createAddBooksOps(AddBooksOps value) {
        return new JAXBElement<AddBooksOps>(_AddBooksOps_QNAME, AddBooksOps.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://persistent.com/", name = "getBooksResponse")
    public JAXBElement<GetBooksResponse> createGetBooksResponse(GetBooksResponse value) {
        return new JAXBElement<GetBooksResponse>(_GetBooksResponse_QNAME, GetBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBooksOpsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://persistent.com/", name = "addBooksOpsResponse")
    public JAXBElement<AddBooksOpsResponse> createAddBooksOpsResponse(AddBooksOpsResponse value) {
        return new JAXBElement<AddBooksOpsResponse>(_AddBooksOpsResponse_QNAME, AddBooksOpsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://persistent.com/", name = "addBook")
    public JAXBElement<AddBook> createAddBook(AddBook value) {
        return new JAXBElement<AddBook>(_AddBook_QNAME, AddBook.class, null, value);
    }

}
