/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.ac.cr.backend.service;

import una.ac.cr.backend.dao.BookTypeDAO;
import una.ac.cr.backend.model.BookType;

/**
 *
 * @author cristian
 */
public class BookTypeServiceImpl implements BookTypeService {

    private BookTypeDAO bookTypeDAO;

    /**
     *
     */
    public BookTypeServiceImpl() {
    }

    /**
     *
     * @param bookTypeDAO
     */
    public BookTypeServiceImpl(BookTypeDAO bookTypeDAO) {
        this.bookTypeDAO = bookTypeDAO;
    }

    @Override
    public boolean deleteAll() {
        return bookTypeDAO.deleteAll();
    }

    @Override
    public BookType saveBookType(BookType bookType) {
        return bookTypeDAO.saveBookType(bookType);
    }

    @Override
    public BookType findByType(String type) {
        return bookTypeDAO.findByType(type);
    }
}
