package OneToMany;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;
@Entity @Table(name="dpt_tbl")
public class Dept {
@Id
	private int dptid;
	
@Column
private String dptname;

public Set getEmpref() 
{
return empref;
}

public void setEmpref(Set empref) 
{
this.empref=empref;	
}



@OneToMany(fetch=FetchType.LAZY,targetEntity=Employe.class,cascade=CascadeType.ALL)
@JoinColumn(name="dptid",referencedColumnName="dptid")
private Set empref;
public int getDptid() {
	return dptid;
}

public void setDptid(int dptid) {
	this.dptid = dptid;
}

public String getDptname() {
	return dptname;
}

public void setDptname(String dptname) {
	this.dptname = dptname;
}
	
}
