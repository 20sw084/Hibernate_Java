package myhibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {
@Id
	private int userId;
	private String userName;

	public void setId(int userId) {
		this.userId=userId;
	}
	public void setName(String userName) {
		this.userName=userName;
	}
	public int getId() {
		return userId;
	}
	public String getName() {
		return userName;
	}
}
