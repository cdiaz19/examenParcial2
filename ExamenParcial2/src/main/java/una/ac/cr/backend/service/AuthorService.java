/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.ac.cr.backend.service;

import java.util.List;
import una.ac.cr.backend.model.Author;
import una.ac.cr.backend.model.AuthorContact;

/**
 *
 * @author cristian
 */
public interface AuthorService {

    /**
     *
     * @return
     */
    public boolean deleteAll();

    /**
     *
     * @param authorContact
     * @return
     */
    public AuthorContact saveAuthorContact(AuthorContact authorContact);

    /**
     *
     * @return
     */
    public List<AuthorContact> findAll();

    /**
     *
     * @param name
     * @return
     */
    public Author findByName(String name);
}
