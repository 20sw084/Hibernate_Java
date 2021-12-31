package myhibernate;
import java.io.*;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Main {
	public static void main(String[] args) throws IOException {
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Users user=new Users();
		UserDetails d=new UserDetails();
//		user.setId(1);
		System.out.println("Enter User Name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		user.setUserName(name);
		
		System.out.println("Enter User Address");
		sc=new Scanner(System.in);
		String address=sc.next();
		d.setAddress(address);
		
		System.out.println("Enter User Age");
		sc=new Scanner(System.in);
		int age=sc.nextInt();
		d.setAge(age);

		System.out.println("Enter User Date of Birth(mm/dd/yyyy)");
		sc=new Scanner(System.in);
		String date=sc.next();
		d.setDob(date);
		
		if(d.getAge()<18) {
			d.setCnicHolder(false);
		}
		else {
			d.setCnicHolder(true);
		}
		
		d.setCurrentDate(new Date());
		
		FileInputStream fis=new FileInputStream("src/Mine.jpg");
		byte[] data=new byte[fis.available()];
		fis.read(data);
		d.setProfilePic(data);
		fis.close();
		
		user.setUd(d);
		
		
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		System.out.println("Done");
	}
}