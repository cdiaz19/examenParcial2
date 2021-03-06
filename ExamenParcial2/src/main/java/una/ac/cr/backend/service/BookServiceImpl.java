/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.ac.cr.backend.service;

import java.util.ArrayList;
import java.util.List;
import una.ac.cr.backend.dao.BookDAO;
import una.ac.cr.backend.model.Book;

/**
 *
 * @author cristian
 */
public class BookServiceImpl implements BookService {

    private BookDAO bookDAO;

    /**
     *
     */
    public BookServiceImpl() {
    }

    /**
     *
     * @param bookDAO
     */
    public BookServiceImpl(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    public boolean deleteAll() {
        return bookDAO.deleteAll();
    }

    @Override
    public Book saveBook(Book book) {
        return bookDAO.saveBook(book);
    }

    @Override
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

    /**
     * @return the bookDAO
     */
    public BookDAO getBookDAO() {
        return bookDAO;
    }

    /**
     * @param bookDAO the bookDAO to set
     */
    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    public float totalPriceAll() {
        float totalPrice = 0;
        List<Book> bookList = new ArrayList<>();

        bookList = bookDAO.findAll();
        for (Book book : bookList) {
            totalPrice += book.getPrice();
        }

        return totalPrice;
    }
}
