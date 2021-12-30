package myhibernate;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		UserDetails user=new UserDetails();
//		user.setId(1);
		System.out.println("Enter UserName");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		user.setName(name);
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}
}