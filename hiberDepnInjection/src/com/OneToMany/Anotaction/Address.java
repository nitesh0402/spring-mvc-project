package com.OneToMany.Anotaction;

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
@Table (name="add_tbl")
public class Address {

	
@Id
private int addNum;
@Column
private String Name;
	@OneToMany(fetch=FetchType.LAZY,targetEntity =Parsan.class,cascade = CascadeType.ALL )
	@JoinColumn(name="addNum",referencedColumnName="addNum")
	
	private Set parsnref;

	public int getAddNum() {
		return addNum;
	}

	public void setAddNum(int addNum) {
		this.addNum = addNum;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	public Set getParsnref() {
		return parsnref;
	}

	public void setParsnref(Set parsnref) {
		this.parsnref = parsnref;
	}	
        	
}
