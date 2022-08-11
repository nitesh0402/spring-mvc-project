package CrudPackage2;

public class SvmStudent {
	
private String StudentName;
private int StudentRollNum;
private int SchoolCode;
private int StudentClassNumber;
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String studentName) {
	StudentName = studentName;
}
public int getStudentRollNum() {
	return StudentRollNum;
}
public void setStudentRollNum(int studentRollNum) {
	StudentRollNum = studentRollNum;
}

public int getSchoolCode() {
	return SchoolCode;
}
public void setSchoolCode(int schoolCode) {
	SchoolCode = schoolCode;
}
public int getStudentClassNumber() {
	return StudentClassNumber;
}
public void setStudentClassNumber(int studentClassNumber) {
	StudentClassNumber = studentClassNumber;
}
@Override
public String toString() {
	return "SvmStudent [StudentName=" + StudentName + ", StudentRollNum=" + StudentRollNum + ", SchoolCode="
			+ SchoolCode + ", StudentClassNumber=" + StudentClassNumber + "]";
}


}
