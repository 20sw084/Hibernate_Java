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
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int userId, String userName, UserDetails ud) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.ud = ud;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public UserDetails getUd() {
		return ud;
	}
	public void setUd(UserDetails ud) {
		this.ud = ud;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", ud=" + ud + "]";
	}
	private UserDetails ud;

}