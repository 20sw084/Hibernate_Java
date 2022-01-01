package myhibernate;
import java.io.*;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Main {
	public static void main(String[] args) throws IOException {
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Teacher T1=new Teacher();
		T1.setTeacher_name("Sir Ayaz Siyal");
		T1.setTeacher_subject("Applied Calculus");
		
		List<Student> list=new ArrayList<Student>();
		
		Student S1=new Student();
		S1.setRoll_number("20SW084");
		S1.setName("Junaid Aslam");
		
		Student S2=new Student();
		S2.setRoll_number("20SW099");
		S2.setName("Muhammad Ali");
		
		Student S3=new Student();
		S3.setRoll_number("20SW092");
		S3.setName("Muhammad Ahmed");
		
		list.add(S1);
		list.add(S2);
		list.add(S3);
		
		T1.setStudents(list);

		session.beginTransaction();
//		session.save(T1);
//		session.save(S1);
//		session.save(S2);
//		session.save(S3);		
		session.getTransaction().commit();
		
		
		//Fetching data....
		Teacher t1=(Teacher) session.get(Teacher.class, 1);
		System.out.println(t1);
		
//		Users user=new Users();
//		UserDetails d=new UserDetails();
////		user.setId(1);
//		System.out.println("Enter User Name");
//		Scanner sc=new Scanner(System.in);
//		String name=sc.next();
//		user.setUserName(name);
//		//=new ArrayList<Student>()
//		System.out.println("Enter User Address");
//		sc=new Scanner(System.in);
//		String address=sc.next();
//		d.setAddress(address);
//		
//		System.out.println("Enter User Age");
//		sc=new Scanner(System.in);
//		int age=sc.nextInt();
//		d.setAge(age);
//
//		System.out.println("Enter User Date of Birth(mm/dd/yyyy)");
//		sc=new Scanner(System.in);
//		String date=sc.next();
//		d.setDob(date);
//		
//		if(d.getAge()<18) {
//			d.setCnicHolder(false);
//		}
//		else {
//			d.setCnicHolder(true);
//		}
//		
//		d.setCurrentDate(new Date());
//		
//		FileInputStream fis=new FileInputStream("src/Mine.jpg");
//		byte[] data=new byte[fis.available()];
//		fis.read(data);
//		d.setProfilePic(data);
//		fis.close();
//		d.setDetails_id(2);
//		
//		user.setUd(d);
//		user.setUserId(2);
//		
//		session.beginTransaction();
//		session.save(user);
//		session.save(d);
//		session.getTransaction().commit();
//		
//			//Fetching Data......
//		Users u=(Users)session.load(Users.class, 2);
//		System.out.println(u.getUserName());
//		System.out.println(u.getUd().toString());
//		session.close();
//		System.out.println("Done");
	}
}