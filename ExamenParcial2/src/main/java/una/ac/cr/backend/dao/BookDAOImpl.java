/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.ac.cr.backend.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.classic.Session;
import una.ac.cr.backend.model.Book;

/**
 *
 * @author cristian
 */
public class BookDAOImpl implements BookDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public boolean deleteAll() {
        boolean isDeleted = false;
        List<Book> bookList = new ArrayList<>();

        session.beginTransaction();
        bookList = session.createCriteria(Book.class).list();
        for (Object obj : bookList) {
            session.delete(obj);
            isDeleted = true;
        }
        session.getTransaction().commit();

        return isDeleted;
    }

    @Override
    public Book saveBook(Book book) {
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();

        return book;
    }

    @Override
    public List<Book> findAll() {
        List<Book> bookList = new ArrayList<>();
        bookList = session.createCriteria(Book.class).list();

        return bookList;
    }

}
