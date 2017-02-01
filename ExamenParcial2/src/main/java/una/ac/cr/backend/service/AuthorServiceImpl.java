/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.ac.cr.backend.service;

import java.util.List;
import una.ac.cr.backend.dao.AuthorContactDAO;
import una.ac.cr.backend.dao.AuthorDAO;
import una.ac.cr.backend.model.Author;
import una.ac.cr.backend.model.AuthorContact;

/**
 *
 * @author cristian
 */
public class AuthorServiceImpl implements AuthorService {

    private AuthorDAO authorDAO;
    private AuthorContactDAO authorContactDAO;

    /**
     *
     */
    public AuthorServiceImpl() {
    }

    /**
     *
     * @param authorContactDAO
     */
    public AuthorServiceImpl(AuthorContactDAO authorContactDAO) {
        this.authorContactDAO = authorContactDAO;
    }

    /**
     *
     * @param authorDAO
     */
    public AuthorServiceImpl(AuthorDAO authorDAO) {
        this.authorDAO = authorDAO;
    }

    /**
     *
     * @param authorDAO
     * @param authorContactDAO
     */
    public AuthorServiceImpl(AuthorDAO authorDAO, AuthorContactDAO authorContactDAO) {
        this.authorDAO = authorDAO;
        this.authorContactDAO = authorContactDAO;
    }

    @Override
    public Author findByName(String name) {
        return authorDAO.findByName(name);
    }

    @Override
    public boolean deleteAll() {
        return authorContactDAO.deleteAll();
    }

    @Override
    public AuthorContact saveAuthorContact(AuthorContact authorContact) {
        return authorContactDAO.saveAuthorContact(authorContact);
    }

    @Override
    public List<AuthorContact> findAll() {
        return authorContactDAO.findAll();
    }

    /**
     * @return the authorDAO
     */
    public AuthorDAO getAuthorDAO() {
        return authorDAO;
    }

    /**
     * @param authorDAO the authorDAO to set
     */
    public void setAuthorDAO(AuthorDAO authorDAO) {
        this.authorDAO = authorDAO;
    }

    /**
     * @return the authorContactDAO
     */
    public AuthorContactDAO getAuthorContactDAO() {
        return authorContactDAO;
    }

    /**
     * @param authorContactDAO the authorContactDAO to set
     */
    public void setAuthorContactDAO(AuthorContactDAO authorContactDAO) {
        this.authorContactDAO = authorContactDAO;
    }
}
