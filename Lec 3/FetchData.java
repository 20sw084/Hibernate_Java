package myhibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s = sessionFactory.openSession();
		
		//Get Method first checks for cache memory and after that looks 
		//for database if not found. 
		//In our case session object contains userdetails stored in cache
		//by first object.
		//Again for second object no more data is get from database and no more 
		//select query made by hibernate. It uses cache one.
		UserDetails u1=(UserDetails)s.get(UserDetails.class,1);
		UserDetails u2=(UserDetails)s.get(UserDetails.class,2);
		System.out.println(u1.toString());
		
		
				//Load Method makes proxy object when first object is created 
				//increases the performane.
				//select query is made when data is needed. 
				//proxy==copy
				//When properties of that object is used than it hits the database
				UserDetails u3=(UserDetails)s.load(UserDetails.class,1);
				UserDetails u4=(UserDetails)s.load(UserDetails.class,2);
				System.out.println(u3.toString());
				
				
		
		System.out.println("Done");
		
		s.close();
	}

}
