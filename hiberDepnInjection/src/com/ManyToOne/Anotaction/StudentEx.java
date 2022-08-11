package com.ManyToOne.Anotaction;

import javax.persistence.*;

import org.hibernate.annotations.ManyToAny;

@Entity @Table(name="Stu_tbl")
public class StudentEx {
@Id
private int sRno;
@Column
private String same;

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="sRno",referencedColumnName="sRno")
private ClassEx classex;
public int getsRno() {
	return sRno;
}
public void setsRno(int sRno) {
	this.sRno = sRno;
}
public String getSame() {
	return same;
}
public ClassEx getClassex() {
	return classex;
}
public void setClassex(ClassEx classex) {
	this.classex = classex;
}
public void setSame(String same) {
	this.same = same;
}
	
}
