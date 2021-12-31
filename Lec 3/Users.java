package myhibernate;
import javax.persistence.*;

@Entity
@Table(name="users")
public class Users {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int userId;
	@Column(name="Name")
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