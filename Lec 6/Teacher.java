package myhibernate;

import java.util.*;
import javax.persistence.*;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int teacher_id;
	@Column(name="TeacherName")
	private String teacher_name;
	@Column(name="TeacherSubject")	
	private String teacher_subject;
	@OneToMany
	private List<Student> students;
	public int getTeacher_id() {
		return teacher_id;
	}
	@Override
	public String toString() {
		return "Teacher [teacher_id=" + teacher_id + ", teacher_name=" + teacher_name + ", teacher_subject="
				+ teacher_subject + ", students=" + students + "]";
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public String getTeacher_subject() {
		return teacher_subject;
	}
	public void setTeacher_subject(String teacher_subject) {
		this.teacher_subject = teacher_subject;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Teacher(int teacher_id, String teacher_name, String teacher_subject, List<Student> students) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
		this.teacher_subject = teacher_subject;
		this.students = students;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
}
