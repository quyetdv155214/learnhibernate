package quyet.demo.hibernate.main.oneToOne;

import org.hibernate.Session;
import quyet.demo.hibernate.entities.mappingexample.oneToOne.Person;
import quyet.demo.hibernate.entities.mappingexample.oneToOne.PersonDetail;
import quyet.demo.hibernate.utils.HibernateUtil;

public class TestOneToOne {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Person alex = new Person();
        alex.setPersonName("alex");

        PersonDetail alexDetail = new PersonDetail();
        alexDetail.setAddress("new address");
        alexDetail.setZipcode("11111111");

        alex.setPersonDetail(alexDetail);
        session.save(alex);
        session.save(alexDetail);
        session.getTransaction().commit();
    }
}
