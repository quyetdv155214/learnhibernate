package quyet.demo.hibernate.main.simplehr;

import org.hibernate.Session;
import quyet.demo.hibernate.utils.HibernateUtil;

import java.util.List;

public class ManageDept {
    public List getListDept(){
        List list;

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        list = session.createQuery("from Department ").list();
        session.getTransaction().commit();

        return list;
    }
}
