package quyet.demo.hibernate.main.manyToMany;

import org.hibernate.Session;
import quyet.demo.hibernate.entities.mappingexample.manyToMany.Delegate;
import quyet.demo.hibernate.entities.mappingexample.manyToMany.Event;
import quyet.demo.hibernate.utils.HibernateUtil;

public class TestManyToMany {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Event event1 = new Event();
        event1.setEventName("java event");
        Event event2 = new Event();
        event2.setEventName("c# event");
        Event event3 = new Event();
        event3.setEventName("web event");


        Delegate delegate1 = new Delegate();
        delegate1.setDelegateName("pedfsdfr1");

        Delegate delegate2 = new Delegate();
        delegate1.setDelegateName("pesasdr2");




        event1.getDelegates().add(delegate1);
        event1.getDelegates().add(delegate2);

        event2.getDelegates().add(delegate1);
        event2.getDelegates().add(delegate2);

        event3.getDelegates().add(delegate1);
        event3.getDelegates().add(delegate2);

        delegate1.getEvents().add(event1);
        delegate1.getEvents().add(event3);
        delegate1.getEvents().add(event2);

        delegate2.getEvents().add(event2);
        delegate2.getEvents().add(event3);



        session.save(delegate1);
        session.save(delegate2);

        session.save(event1);
        session.save(event2);
        session.save(event3);
        session.getTransaction().commit();
    }
}
