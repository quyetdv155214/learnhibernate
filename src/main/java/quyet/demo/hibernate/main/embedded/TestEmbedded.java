package quyet.demo.hibernate.main.embedded;

import org.hibernate.Session;
import quyet.demo.hibernate.entities.embeddedObjects.AddressEmbedded;
import quyet.demo.hibernate.entities.embeddedObjects.PersonEmbedded;
import quyet.demo.hibernate.utils.HibernateUtil;

public class TestEmbedded {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        AddressEmbedded ad = new AddressEmbedded();
        ad.setCity("ha noi");
        ad.setLineOne("line one");
        ad.setLineTwo("line tow");
        PersonEmbedded pe = new PersonEmbedded();

        pe.setAddress(ad);
        session.save(pe);
        session.getTransaction().commit();
    }
}
