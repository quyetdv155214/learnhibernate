package quyet.demo.hibernate.manage;

import org.hibernate.Session;
import org.hibernate.Transaction;

import quyet.demo.hibernate.entity.Customer;
import quyet.demo.hibernate.entity.User;
import quyet.demo.hibernate.utils.HibernateUtil;

public class ManageUser {
	public Integer addUser(User user) {

		return null;
	}

	public Integer addCustomer(Customer cus) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(cus);

		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			if (session != null) {
				session.close();
			}

		}

		return null;
	}
}
