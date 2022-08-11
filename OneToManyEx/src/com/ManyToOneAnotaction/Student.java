package com.ManyToOneAnotaction;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="stu-tbl")
public class Student {
@Id
	private  int sRollNumber;
@Column
private String sName;
public int getsRollNumber() {
	return sRollNumber;
}
public void setsRollNumber(int sRollNumber) {
	this.sRollNumber = sRollNumber;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}


}
