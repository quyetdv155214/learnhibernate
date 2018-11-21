package quyet.demo.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import quyet.demo.hibernate.entity.Boss;

public class ManageBoss {
	private static SessionFactory factory;
	public static void main(String[] args) {
		factory = new Configuration().configure().buildSessionFactory();
		ManageBoss mb = new ManageBoss();
		mb.addBoss("new boss");

	}
	public Integer addBoss(String name){
		Session session = factory.openSession();

		Transaction tx = null;
		Integer bossId = null;
		try {
			tx = session.beginTransaction();
			Boss boss = new Boss(name);
			bossId = (Integer) session.save(boss);
			tx.commit();
			System.out.println("log");
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
		return bossId;
	}
}
