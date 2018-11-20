package quyet.demo.hibernate.manage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import quyet.demo.hibernate.entities.Book;
import quyet.demo.hibernate.utils.HibernateUtil;

public class BookManage {
    private SessionFactory factory;

    public Integer addBook(String name, String author, double price){
        factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = null;
        Integer bookId = null;
        try {
            tx = session.beginTransaction();
            Book book = new Book(name , author,price);
            bookId = (Integer) session.save(book);
            tx.commit();
        } catch (Exception e) {
            // TODO: handle exception
            if(tx != null )
            {
                tx.rollback();
            }
            System.out.println(e.getMessage());
        }finally {
            if (session !=null) {
                session.close();
            }
        }
        return bookId;
    }
}
