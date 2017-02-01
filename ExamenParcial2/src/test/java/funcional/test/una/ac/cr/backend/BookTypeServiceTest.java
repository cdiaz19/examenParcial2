/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcional.test.una.ac.cr.backend;

import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import una.ac.cr.backend.dao.BookTypeDAO;
import una.ac.cr.backend.dao.BookTypeDAOImpl;
import una.ac.cr.backend.model.BookType;
import una.ac.cr.backend.service.BookTypeService;
import una.ac.cr.backend.service.BookTypeServiceImpl;

/**
 *
 * @author cristian
 */
public class BookTypeServiceTest {

    private BookTypeDAO bookTypeDAO;
    private BookTypeService bookTypeService;
    private List<BookType> bookTypes;
    private BookType bookType = null;

    /*@Test
    public void testSaveAuthorContact() {
        bookTypeDAO = new BookTypeDAOImpl();
        bookTypeService = new BookTypeServiceImpl(bookTypeDAO);

        bookType = new BookType();
        bookType.setType("Novela");

        bookType = bookTypeService.saveBookType(bookType);
        assertNotNull(bookType.getIdType());
    }

    @Test
    public void testFindByBookTypeName() {
        bookTypeDAO = mock(BookTypeDAOImpl.class);
        bookTypeService = new BookTypeServiceImpl(bookTypeDAO);

        bookType = new BookType();
        bookType.setType("Novela");

        when(bookTypeService.findByType(bookType.getType())).thenReturn(bookType);

        assertThat(bookType.getType(), is("Novela"));
    }

    @After
    public void deleteAll() {
        bookTypeDAO = new BookTypeDAOImpl();
        bookTypeService = new BookTypeServiceImpl(bookTypeDAO);
    }*/
}
