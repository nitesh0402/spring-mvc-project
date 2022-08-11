package com.ManyToOne.Anotaction;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity @Table(name ="cls_tbl")

public class ClassEx {
@Id
	
private int cNum;
@Column
private String cName;
public int getcNum() {
	return cNum;
}
public void setcNum(int cNum) {
	this.cNum = cNum;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}


	
	
}
