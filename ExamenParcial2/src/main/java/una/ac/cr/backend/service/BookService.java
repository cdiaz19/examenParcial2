/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.ac.cr.backend.service;

import java.util.List;
import una.ac.cr.backend.model.Book;

/**
 *
 * @author cristian
 */
public interface BookService {

    /**
     *
     * @return
     */
    public boolean deleteAll();

    /**
     *
     * @param book
     * @return
     */
    public Book saveBook(Book book);

    /**
     *
     * @return
     */
    public List<Book> findAll();

    /**
     *
     * @return
     */
    public float totalPriceAll();
}
