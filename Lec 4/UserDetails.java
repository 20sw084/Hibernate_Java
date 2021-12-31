package myhibernate;

import java.util.Date;
import javax.persistence.*;

@Embeddable
public class UserDetails {
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
	@Override
	public String toString() {
		return "UserDetails [address=" + address + ", age=" + age + ", dob=" + dob + ", currentDate="
				+ currentDate + ", isCnicHolder=" + isCnicHolder + ", n=" + n + "]";
	}
	@Transient
	private int n;
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetails( String address, int age, String dob, Date currentDate, boolean isCnicHolder,
			byte[] profilePic, int n) {
		super();
		this.address = address;
		this.age = age;
		this.dob = dob;
		this.currentDate = currentDate;
		this.isCnicHolder = isCnicHolder;
		this.profilePic = profilePic;
		this.n = n;
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
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}	
}
