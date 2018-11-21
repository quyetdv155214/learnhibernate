package quyet.demo.hibernate.main;

import org.hibernate.Session;
import quyet.demo.hibernate.entities.example.Event;
import quyet.demo.hibernate.utils.HibernateUtil;

import java.util.Date;
import java.util.List;

public class EventManage {
    public List listEvents() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
//        String qr = "from Event";

        List result = session.createQuery("from Event").list();
        session.getTransaction().commit();
        return result;
    }

    public int addEvent(Date eventDate, String title) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Event event = new Event(eventDate, title);
        int eventId = (int) session.save(event);

        session.getTransaction().commit();
        return eventId;

    }

}
