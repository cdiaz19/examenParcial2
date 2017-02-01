/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.ac.cr.backend.webservice;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import una.ac.cr.backend.dao.BookDAO;
import una.ac.cr.backend.dao.BookDAOImpl;
import una.ac.cr.backend.model.Book;
import una.ac.cr.backend.service.BookService;
import una.ac.cr.backend.service.BookServiceImpl;

/**
 * REST Web Service
 *
 * @author cristian
 */
@Path("books")
public class BookWebService {

    private BookDAO bookDAO;
    private BookService bookService;

    @Context
    private UriInfo context;

    /**
     * Retrieves All the Books
     *
     * @return
     */
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAllBook() {
        List<Book> bookList = null;
        bookDAO = new BookDAOImpl();
        bookService = new BookServiceImpl(bookDAO);

        bookList = bookService.findAll();

        return bookList;
    }

    /**
     *
     * Create a new Book
     *
     * @param book
     * @return
     */
    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Book createBook(Book book) {
        bookDAO = new BookDAOImpl();
        bookService = new BookServiceImpl(bookDAO);
        book = bookService.saveBook(book);

        return book;
    }
}
