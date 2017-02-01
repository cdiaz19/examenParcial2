/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.ac.cr.backend.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.classic.Session;
import una.ac.cr.backend.model.AuthorContact;

/**
 *
 * @author cristian
 */
public class AuthorContactDAOImpl implements AuthorContactDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public boolean deleteAll() {
        boolean isDeleted = false;

        session.beginTransaction();
        List<AuthorContact> authorContactList = new ArrayList<>();
        authorContactList = session.createCriteria(AuthorContact.class).list();

        session.delete(authorContactList);
        isDeleted = true;
        session.getTransaction().commit();

        return isDeleted;
    }

    @Override
    public AuthorContact saveAuthorContact(AuthorContact authorContact) {
        session.beginTransaction();
        session.save(authorContact);
        session.getTransaction().commit();

        return authorContact;
    }

    @Override
    public List<AuthorContact> findAll() {
        List<AuthorContact> authorContactList = new ArrayList<>();
        authorContactList = session.createCriteria(AuthorContact.class).list();

        return authorContactList;
    }

}
