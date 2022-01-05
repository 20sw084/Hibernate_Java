package myhibernate;

import java.util.List;
import javax.persistence.*;

@Entity
public class Student {
@Id
@Column(length=11)
	private String roll_number;
@Column(name="StudentName")
	private String name;
@ManyToMany
@JoinTable(
		name="stds_tchr",
		joinColumns= {@JoinColumn(name="std_id")},
		inverseJoinColumns={@JoinColumn(name="thr_id")}
)

private List<Teacher> teachers;

public List<Teacher> getTeachers() {
	return teachers;
}
public void setTeachers(List<Teacher> list3) {
	this.teachers = list3;
}
public String getRoll_number() {
	return roll_number;
}
public void setRoll_number(String roll_number) {
	this.roll_number = roll_number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Student(String roll_number, String name) {
	super();
	this.roll_number = roll_number;
	this.name = name;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
	
}
