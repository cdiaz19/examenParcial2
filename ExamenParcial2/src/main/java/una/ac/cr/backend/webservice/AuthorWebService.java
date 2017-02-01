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
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import una.ac.cr.backend.dao.AuthorContactDAO;
import una.ac.cr.backend.dao.AuthorContactDAOImpl;
import una.ac.cr.backend.dao.AuthorDAO;
import una.ac.cr.backend.dao.AuthorDAOImpl;
import una.ac.cr.backend.model.Author;
import una.ac.cr.backend.model.AuthorContact;
import una.ac.cr.backend.service.AuthorService;
import una.ac.cr.backend.service.AuthorServiceImpl;

/**
 * REST Web Service
 *
 * @author cristian
 */
@Path("authors")
public class AuthorWebService {

    private AuthorDAO authorDAO;
    private AuthorContactDAO authorContactDAO;
    private AuthorService authorService;

    @Context
    private UriInfo context;

    /**
     * Retrieves All the AuthorContacts
     *
     * @return
     */
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<AuthorContact> getAllAuthorContact() {
        List<AuthorContact> authorContactList = null;
        authorContactDAO = new AuthorContactDAOImpl();
        authorService = new AuthorServiceImpl(authorContactDAO);

        authorContactList = authorService.findAll();

        return authorContactList;
    }

    /**
     * Retrieves only one author
     *
     * @param name_author
     * @return
     */
    @GET
    @Path("/{name_author}")
    @Produces(MediaType.APPLICATION_JSON)
    public Author getOfficeId(@PathParam("name_author") String name_author) {
        Author author = null;
        authorDAO = new AuthorDAOImpl();
        authorService = new AuthorServiceImpl(authorDAO);
        author = authorService.findByName(name_author);

        return author;
    }

    /**
     *
     * Create a new AuthorContact
     *
     * @param authorContact
     * @return
     */
    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public AuthorContact createAuthorContact(AuthorContact authorContact) {
        authorDAO = new AuthorDAOImpl();
        authorService = new AuthorServiceImpl(authorDAO);
        authorContact = authorService.saveAuthorContact(authorContact);

        return authorContact;
    }
}
