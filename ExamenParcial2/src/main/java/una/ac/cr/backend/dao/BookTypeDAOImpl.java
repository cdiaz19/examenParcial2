/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.ac.cr.backend.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import una.ac.cr.backend.model.BookType;

/**
 *
 * @author cristian
 */
public class BookTypeDAOImpl implements BookTypeDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public boolean deleteAll() {
        boolean isDeleted = false;
        List<BookType> bookTypeList = new ArrayList<>();

        session.beginTransaction();
        bookTypeList = session.createCriteria(BookType.class).list();
        for (Object obj : bookTypeList) {
            session.delete(obj);
            isDeleted = true;
        }
        session.getTransaction().commit();

        return isDeleted;
    }

    @Override
    public BookType saveBookType(BookType bookType) {
        session.beginTransaction();
        session.save(bookType);
        session.getTransaction().commit();

        return bookType;
    }

    @Override
    public BookType findByType(String type) {
        BookType bookType = null;
        Query query = session.createQuery("from BookType where type = :type ");
        query.setParameter("type", type);

        if (query.list().size() > 0) {
            bookType = (BookType) query.list().get(0);
        }

        return bookType;
    }
}
