package by.matrosov.appl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDaoImpl implements PersonDao{

    private SessionFactory sessionFactory;

    public PersonDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session currentSession() {
        try {
            return sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            return sessionFactory.openSession();
        }
    }

    public void addPerson(Person person) {
        currentSession().save(person);
    }

    public void savePerson(Person person) {
        currentSession().update(person);
    }

    public Person getPersonById(long id) {
        return currentSession().get(Person.class, id);
    }
}
