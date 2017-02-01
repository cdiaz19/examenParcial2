/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.ac.cr.backend.dao;

import org.hibernate.Query;
import org.hibernate.classic.Session;
import una.ac.cr.backend.model.Author;

/**
 *
 * @author cristian
 */
public class AuthorDAOImpl implements AuthorDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public Author findByName(String name) {
        Author author = null;
        Query query = session.createQuery("from Author where name = :name ");
        query.setParameter("name", name);

        if (query.list().size() > 0) {
            author = (Author) query.list().get(0);
        }

        return author;
    }
}
