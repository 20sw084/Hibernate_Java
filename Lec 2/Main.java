package myhibernate;
import java.io.*;
import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) throws IOException {
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Users user=new Users();
		UserDetails ud=new UserDetails();
//		user.setId(1);
		System.out.println("Enter User Name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		user.setName(name);
		
		System.out.println("Enter User Address");
		sc=new Scanner(System.in);
		String address=sc.next();
		ud.setAddress(address);
		
		System.out.println("Enter User Age");
		sc=new Scanner(System.in);
		int age=sc.nextInt();
		ud.setAge(age);

		System.out.println("Enter User Date of Birth(mm/dd/yyyy)");
		sc=new Scanner(System.in);
		String date=sc.next();
		ud.setDob(date);
		
		if(ud.getAge()<18) {
			ud.setCnicHolder(false);
		}
		else {
			ud.setCnicHolder(true);
		}
		
		ud.setCurrentDate(new Date());
		
		FileInputStream fis=new FileInputStream("src/Mine.jpg");
		byte[] data=new byte[fis.available()];
		fis.read(data);
		ud.setProfilePic(data);
		
		
		session.beginTransaction();
		session.save(user);
		session.save(ud);
		session.getTransaction().commit();
		session.close();
		System.out.println("Done");
	}
}