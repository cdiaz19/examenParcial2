/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcional.test.una.ac.cr.backend;

import java.util.Calendar;
import java.util.List;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import una.ac.cr.backend.dao.BookDAO;
import una.ac.cr.backend.dao.BookDAOImpl;
import una.ac.cr.backend.model.Author;
import una.ac.cr.backend.model.Book;
import una.ac.cr.backend.model.BookType;
import una.ac.cr.backend.service.BookService;
import una.ac.cr.backend.service.BookServiceImpl;

/**
 *
 * @author cristian
 */
public class BookServiceTest {

    private BookDAO bookDAO;
    private BookService bookService;
    private List<Book> books;
    private Book book = null;

    @Test
    public void testSaveBook() {
        bookDAO = new BookDAOImpl();
        bookService = new BookServiceImpl(bookDAO);

        book = new Book();
        Author author = new Author();
        BookType type = new BookType();
        Calendar date = Calendar.getInstance();

        author.setName("William Shakespeare");
        type.setType("Drama");
        date.set(1597, 02, 01);

        book.setAuthor(author);
        book.setType(type);
        book.setName("Romeo y Julieta");
        book.setDateRelease(date);
        book.setPrice(16500);

        book = bookService.saveBook(book);
        assertNotNull(book.getIdBook());
    }

    @Test
    public void testFindAllBook() {
        bookDAO = new BookDAOImpl();
        bookService = new BookServiceImpl(bookDAO);

        books = bookService.findAll();

        assertEquals(books.size(), books.size());
    }
    
    @Test
    public void testDeleteAllBook() {
        bookDAO = new BookDAOImpl();
        bookService = new BookServiceImpl(bookDAO);
        boolean isDeleted = false;

        isDeleted = bookService.deleteAll();

        assertEquals(isDeleted, true);
    }

    @After
    public void deleteAll() {
        bookDAO = new BookDAOImpl();
        bookService = new BookServiceImpl(bookDAO);
    }
}
