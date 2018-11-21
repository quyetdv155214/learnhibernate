package quyet.demo.hibernate.main;

import org.hibernate.Session;
import quyet.demo.hibernate.entities.example.Event;
import quyet.demo.hibernate.entities.example.Person;
import quyet.demo.hibernate.utils.HibernateUtil;

import java.util.HashSet;
import java.util.Set;

public class PersonManage {
//        public Session getSession(){
//        SessionFactory factory;
//
//        factory = new Configuration().configure().buildSessionFactory();
//        Session session = factory.openSession();
//        return session;
//    }
    public int addPerson(int age, String firstname, String lastname, Set<String> emailAddresses) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Person per = new Person(age, firstname, lastname, emailAddresses);
        int personID = (int) session.save(per);

        session.getTransaction().commit();
        return personID;

    }

    public void addPersonToEvent(int personId, int eventId) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Person aPerson = (Person) session.load(Person.class, personId);
        Event anEvent = (Event) session.load(Event.class, eventId);

        if (aPerson.getEvents() != null) {
            aPerson.getEvents().add(anEvent);
        } else {
            aPerson.setEvents(new HashSet());
            aPerson.getEvents().add(anEvent);
        }

        session.getTransaction().commit();
    }

    public void addEmailToPerson(int personId, String emailAddress) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Person aPerson = (Person) session.load(Person.class, personId);
        // adding to the emailAddress collection might trigger a lazy load of the collection
        aPerson.getEmailAddresses().add(emailAddress);

        session.getTransaction().commit();
    }
}
