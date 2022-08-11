package svm;
import java.util.Set;
public class Corse {
private  int sId;
private String sName;
private Set childern;


public Set getSub() {
	return childern;
}
public void SetSub(Set childern) {
	this.childern = childern;
}
	

public int getsId() {
	return sId;
}
public void setsId(int sId) {
	this.sId = sId;
}
public Set getChildern() {
	return childern;
}
public void setChildern(Set childern) {
	this.childern = childern;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}

	
}
