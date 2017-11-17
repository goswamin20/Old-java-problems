package Inheritance;

public class Student extends Person {
	
	public Student(int age, String name, String dept, int rollNo) {
		super(age, name);
		this.dept = dept;
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [dept=" + dept + ", rollNo=" + rollNo + ", getAge()="
				+ getAge() + ", getName()=" + getName() +"]";
	}
	private String dept;
	private int rollNo;
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}
