package myhibernate;
import java.io.*;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Main {
	public static void main(String[] args) throws IOException {
		
		
	/*	Transient:
				  The Object comes in a transient state when setters and getters of objects called to 
		initialize data. At this stage, neither database connected, nor session object is connected. 
										OR
		Object with properties only.
	*/	
		Student std=new Student();
		std.setRoll_number("15SW15");
		std.setName("Saad");
		std.setTeachers(null);
		
    /*	Persistent:
     *  	  	  Object with properties when connected to database by building session object. 
     *  Data can be saved in database by save or persist method. Until Object is in Persistent 
     *  State. It will be changed acordingly by changes in after although save.
     */
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.save(std);
		std.setName("Jonny");
		
	/*  Detached:
	 * 			 Object comes in detached state when this object is committed and session closes. 
	 * 
	 */
	/*	Removed:
	 * 		    Object when removed from database.	
	 */
		
		
		
	}
}