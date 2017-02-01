/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.ac.cr.backend.service;

import una.ac.cr.backend.model.BookType;

/**
 *
 * @author cristian
 */
public interface BookTypeService {
    
    /**
     *
     * @return
     */
    public boolean deleteAll();

    /**
     *
     * @param bookType
     * @return
     */
    public BookType saveBookType(BookType bookType);

    /**
     *
     * @param type
     * @return
     */
    public BookType findByType(String type);
}
