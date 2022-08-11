package com.oneToManyAnotaction.example;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.*;
@Entity @Table(name="ddpt_tbl")
public class Course {
@Id
private int cCode;
@Column
private String CName;
@Column
private int cNum;
public int getcCode() {
	return cCode;
}

@OneToMany (fetch=FetchType.LAZY,targetEntity = Student.class,cascade=CascadeType.ALL)
@JoinColumn(name="cCode",referencedColumnName ="cCode")
private Set sturef;

public Set getSturef() {
	return sturef;
}
public void setSturef(Set sturef) {
	this.sturef = sturef;
}
public void setcCode(int cCode) {
	this.cCode = cCode;
}
public String getCName() {
	return CName;
}
public void setCName(String cName) {
	CName = cName;
}
public int getcNum() {
	return cNum;
}
public void setcNum(int cNum) {
	this.cNum = cNum;
}
	
	
}
