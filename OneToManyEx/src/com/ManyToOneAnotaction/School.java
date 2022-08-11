package com.ManyToOneAnotaction;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;


@Entity @Table(name="schl_tbl")
public class School {
@Id
	private int schlCode;
@Column
private String schlName;
	
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="sRollNumber",referencedColumnName="sRollNumber")
private Student sturef;

public int getSchlCode() {
	return schlCode;
}

public void setSchlCode(int schlCode) {
	this.schlCode = schlCode;
}

public String getSchlName() {
	return schlName;
}

public void setSchlName(String schlName) {
	this.schlName = schlName;
}

public Student getSturef() {
	return sturef;
}

public void setSturef(Student sturef) {
	this.sturef = sturef;
}

}
