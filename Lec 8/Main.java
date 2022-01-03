package myhibernate;
import java.io.*;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Main {
	public static void main(String[] args) throws IOException {
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		//Fetching data
		Student std=(Student)session.get(Student.class,"20SW026");

		System.out.println(std.getName()+"\n"+std.getRoll_number());
		
		//lazy
		System.out.println(std.getTeachers().size());
		

		Teacher thr=(Teacher)session.get(Teacher.class,1);

		System.out.println(thr.getTeacher_id()+"\n"+thr.getTeacher_name());
		
//		Teacher T1=new Teacher();
//		T1.setTeacher_name("Sir Ayaz Siyal");
//		T1.setTeacher_subject("Applied Calculus");
//		
//		List<Student> list1=new ArrayList<Student>();
//		
//		Student S1=new Student();
//		S1.setRoll_number("20SW084");
//		S1.setName("Junaid Aslam");
//		
//		Student S2=new Student();
//		S2.setRoll_number("20SW046");
//		S2.setName("Abdullah Rashid");
//		
//		Student S3=new Student();
//		S3.setRoll_number("20SW026");
//		S3.setName("Muhammmad Talha");
//		
//		
//		Student S4=new Student();
//		S4.setRoll_number("20SW009");
//		S4.setName("Muhammad Salman");
//		
//		list1.add(S1);
//		list1.add(S2);
//		list1.add(S4);
//		
//		T1.setStudents(list1);
//		
//		Teacher T2=new Teacher();
//		T2.setTeacher_name("Sir Abdul Jabbar Memon");
//		T2.setTeacher_subject("Applied Physics");
//		
//		List<Student> list2=new ArrayList<Student>();
//		
//		Student S5=new Student();
//		S5.setRoll_number("20SW084");
//		S5.setName("Junaid Aslam");
//		
//		Student S6=new Student();
//		S6.setRoll_number("20SW099");
//		S6.setName("Muhammad Ali");		
//		
//		Student S7=new Student();
//		S7.setRoll_number("20SW092");
//		S7.setName("Muhammad Ahmed");
//		
//		list2.add(S5);
//		list2.add(S6);
//		list2.add(S7);
//		list2.add(S3);
//		
//		T2.setStudents(list2);
//		
//		
//		List<Teacher> list3=new ArrayList<Teacher>();
//
//		list3.add(T1);
//		list3.add(T2);
//		
//		S1.setTeachers(list3);
//		S2.setTeachers(list3);
//		S3.setTeachers(list3);
//		S4.setTeachers(list3);
//		S5.setTeachers(list3);
//		S6.setTeachers(list3);
//		S7.setTeachers(list3);
//		
		session.beginTransaction();
//		session.save(T1);
//		session.save(T2);
//		session.save(S1);
//		session.save(S2);
//		session.save(S3);	
//		session.save(S4);
////		session.save(S5);
//		session.save(S6);	
//		session.save(S7);			
		session.getTransaction().commit();
		
		
//		//Fetching data....
//		Teacher t1=(Teacher) session.get(Teacher.class, 1);
//		System.out.println(t1);
		
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