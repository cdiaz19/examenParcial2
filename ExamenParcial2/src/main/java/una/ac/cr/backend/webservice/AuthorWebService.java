/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.ac.cr.backend.webservice;

/*import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import una.ac.cr.backend.dao.AuthorContactDAO;
import una.ac.cr.backend.dao.AuthorContactDAOImpl;
import una.ac.cr.backend.dao.AuthorDAO;
import una.ac.cr.backend.model.AuthorContact;
import una.ac.cr.backend.service.AuthorService;
import una.ac.cr.backend.service.AuthorServiceImpl;*/

/**
 * REST Web Service
 * @author cristian
 */
/*@Path("authors")
public class AuthorWebService {
    
    private AuthorDAO authorDAO;
    private AuthorContactDAO authorContactDAO;
    private AuthorService authorService;
    
    @Context
    private UriInfo context;
    
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<AuthorContact> getAllAuthorContact() {
        List<AuthorContact> authorContactList = null;
        authorContactDAO = new AuthorContactDAOImpl();
        authorService = new AuthorServiceImpl(authorContactDAO);

        authorContactList = authorService.findAll();

        return authorContactList;
    }*/

/*
  


    /**
     * Retrieves All the Offices
     *
     * @return
     */
    /*@GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Office> getAllOffices() {
        List<Office> officeList = null;
        officeDAO = new OfficeDAOHibernateImpl();
        officeService = new OfficeServiceImpl(officeDAO);

        officeList = officeService.findAllOffice();

        return officeList;
    }*/

    /**
     * Retrieves only one office
     *
     * @param id_office
     * @return
     */
    /*@GET
    @Path("/{id_office}")
    @Produces(MediaType.APPLICATION_JSON)
    public Office getOfficeId(@PathParam("id_office") int id_office) {
        Office office = null;
        officeDAO = new OfficeDAOHibernateImpl();
        officeService = new OfficeServiceImpl(officeDAO);
        office = officeService.findByIdOffice(id_office);

        return office;
    }*/

    /**
     *
     * Create a new Office
     *
     * @param office
     * @return
     */
   /* @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Office createOffice(Office office) {

        officeDAO = new OfficeDAOHibernateImpl();
        officeService = new OfficeServiceImpl(officeDAO);
        office = officeService.saveOffice(office);

        return office;
    }*/

    /**
     * Delete a new Office
     *
     * @param id_office
     * @return
     */
   /* @DELETE
    @Path("/{id_office}")
    public boolean deleteOffice(@PathParam("id_office") int id_office) {
        boolean result;
        officeDAO = new OfficeDAOHibernateImpl();
        officeService = new OfficeServiceImpl(officeDAO);
        result = officeService.deleteOffice(id_office);

        return result;
    }*/

    /**
     * Update a Office
     *
     * @param office
     * @return
     */
    /*@PUT
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Office updateOffice(Office office) {

        officeDAO = new OfficeDAOHibernateImpl();
        officeService = new OfficeServiceImpl(officeDAO);
        office = officeService.updateOffice(office);

        return office;
    }*/
    
//}
