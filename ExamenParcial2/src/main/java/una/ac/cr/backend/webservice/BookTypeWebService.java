/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.ac.cr.backend.webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import una.ac.cr.backend.dao.BookTypeDAO;
import una.ac.cr.backend.dao.BookTypeDAOImpl;
import una.ac.cr.backend.model.BookType;
import una.ac.cr.backend.service.BookTypeService;
import una.ac.cr.backend.service.BookTypeServiceImpl;

/**
 *
 * @author cristian
 */
@Path("bookTypes")
public class BookTypeWebService {

    private BookTypeDAO bookTypeDAO;
    private BookTypeService bookTypeService;

    @Context
    private UriInfo context;

    /**
     * Retrieves only one type
     *
     * @param type_name
     * @return
     */
    @GET
    @Path("/{type_name}")
    @Produces(MediaType.APPLICATION_JSON)
    public BookType getTypeName(@PathParam("type_name") String type_name) {
        BookType bookType = null;
        bookTypeDAO = new BookTypeDAOImpl();
        bookTypeService = new BookTypeServiceImpl(bookTypeDAO);
        bookType = bookTypeService.findByType(type_name);

        return bookType;
    }

    /**
     *
     * Create a new BookType
     *
     * @param bookType
     * @return
     */
    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public BookType createBookType(BookType bookType) {
        bookTypeDAO = new BookTypeDAOImpl();
        bookTypeService = new BookTypeServiceImpl(bookTypeDAO);
        bookType = bookTypeService.saveBookType(bookType);

        return bookType;
    }

    /**
     * Delete all BookType
     *
     * @return
     */
    @DELETE
    @Path("/")
    public boolean deleteBookType() {
        boolean result;
        bookTypeDAO = new BookTypeDAOImpl();
        bookTypeService = new BookTypeServiceImpl(bookTypeDAO);
        result = bookTypeService.deleteAll();

        return result;
    }
}
