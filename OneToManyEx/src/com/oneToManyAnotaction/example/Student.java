package com.oneToManyAnotaction.example;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="stu_tbl")
public class Student {
@Id
private int sRNum;
@Column
private  String  sName;
@Column
private  int SClassNum;

public int getsRNum() {
	return sRNum;
}
public void setsRNum(int sRNum) {
	this.sRNum = sRNum;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public int getSClassNum() {
	return SClassNum;
}
public void setSClassNum(int sClassNum) {
	SClassNum = sClassNum;
}



	
}
