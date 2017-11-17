package Inheritance;

public class Employee extends Person {

public Employee(int age, String name, String designation, int empId) {
	super(age, name);
	this.designation = designation;
	this.empId = empId;
}
private String designation;
@Override
public String toString() {
	return "Employee [designation=" + designation + ", empId=" + empId
			+ ", getAge()=" + getAge() + ", getName()=" + getName() + "]";
}
private int empId;
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
}
