package myhibernate;

import java.util.Arrays;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="details")
public class UserDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Details_ID")	
	private int details_id;
	@Column(length = 60, name="Address")
	private String address;
	@Column(name="Age")
	private int age;
	@Column(length=11,name="DateOfBirth")
	private String dob;
	@Temporal(TemporalType.DATE)
	@Column(name="CurrentDate")	
	private Date currentDate;
	@Column(name="CNICHolder")
	private boolean isCnicHolder;
	@Column(name="ProfilePicture")
	@Lob
	private byte[] profilePic;
	@Transient
	private int n;
	@OneToOne
//	(mappedBy="Users")
	private Users user;
	public int getDetails_id() {
		return details_id;
	}
	public void setDetails_id(int details_id) {
		this.details_id = details_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Date getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
	public boolean isCnicHolder() {
		return isCnicHolder;
	}
	public void setCnicHolder(boolean isCnicHolder) {
		this.isCnicHolder = isCnicHolder;
	}
	public byte[] getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(byte[] profilePic) {
		this.profilePic = profilePic;
	}
	@Override
	public String toString() {
		return "UserDetails [details_id=" + details_id + ", address=" + address + ", age=" + age + ", dob=" + dob
				+ ", currentDate=" + currentDate + ", isCnicHolder=" + isCnicHolder + ", profilePic="
				+ ", user=" + user + "]";
	}
	public UserDetails(int details_id, String address, int age, String dob, Date currentDate, boolean isCnicHolder,
			byte[] profilePic, int n, Users user) {
		super();
		this.details_id = details_id;
		this.address = address;
		this.age = age;
		this.dob = dob;
		this.currentDate = currentDate;
		this.isCnicHolder = isCnicHolder;
		this.profilePic = profilePic;
		this.n = n;
		this.user = user;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public UserDetails(int details_id, String address, int age, String dob, Date currentDate, boolean isCnicHolder,
			byte[] profilePic, int n) {
		super();
		this.details_id = details_id;
		this.address = address;
		this.age = age;
		this.dob = dob;
		this.currentDate = currentDate;
		this.isCnicHolder = isCnicHolder;
		this.profilePic = profilePic;
		this.n = n;
	}
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}	
}