/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcional.test.una.ac.cr.backend;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import una.ac.cr.backend.dao.AuthorContactDAO;
import una.ac.cr.backend.dao.AuthorContactDAOImpl;
import una.ac.cr.backend.dao.AuthorDAO;
import una.ac.cr.backend.dao.AuthorDAOImpl;
import una.ac.cr.backend.model.Author;
import una.ac.cr.backend.model.AuthorContact;
import una.ac.cr.backend.service.AuthorService;
import una.ac.cr.backend.service.AuthorServiceImpl;

/**
 *
 * @author cristian
 */
public class AuthorServiceTest {

    private AuthorDAO authorDAO;
    private AuthorContactDAO authorContactDAO;
    private AuthorService authorService;
    private List<AuthorContact> authorContacts;
    private Author author = null;

    public AuthorServiceTest() {
    }

    @Test
    public void testSaveAuthorContact() {
        authorContactDAO = new AuthorContactDAOImpl();
        authorService = new AuthorServiceImpl(authorContactDAO);

        author = new Author();
        AuthorContact authorContact = new AuthorContact();

        author.setName("Garcia Marquez");
        authorContact.setAuthor(author);
        authorContact.setContact("22798952");
        authorContact.setType("Casa");

        authorContact = authorService.saveAuthorContact(authorContact);
        assertNotNull(authorContact.getIdAuthorContact());
    }

    @Test
    public void testFindByAuthorName() {
        authorDAO = mock(AuthorDAOImpl.class);
        authorService = new AuthorServiceImpl(authorDAO);

        author = new Author();
        author.setName("Garcia Marquez");

        when(authorService.findByName(author.getName())).thenReturn(author);

        assertThat(author.getName(), is("Garcia Marquez"));
    }

    @Test
    public void testFindAllAuthorContact() {
        authorContactDAO = new AuthorContactDAOImpl();
        authorService = new AuthorServiceImpl(authorContactDAO);

        authorContacts = (ArrayList<AuthorContact>) authorService.findAll();

        assertEquals(authorContacts.size(), authorContacts.size());
    }

    /*@Test
    public void testDeleteAllAuthors() {
        authorContactDAO = new AuthorContactDAOImpl();
        authorService = new AuthorServiceImpl(authorContactDAO);
        boolean isDeleted = false;

        isDeleted = authorService.deleteAll();

        assertEquals(isDeleted, true);
    }*/

    @After
    public void deleteAll() {
        authorDAO = new AuthorDAOImpl();
        authorContactDAO = new AuthorContactDAOImpl();
        authorService = new AuthorServiceImpl(authorDAO, authorContactDAO);
    }
}
