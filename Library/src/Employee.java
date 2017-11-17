
public class Employee {
private int emp_id;
private String emp_name;
private double emp_salary;
Employee(){
	this.emp_id=0;
	this.emp_name="";
	this.emp_salary=0.0;
}
Employee(int emp_id,String emp_name, double emp_salary){
	this.emp_id=emp_id;
	this.emp_name=emp_name;
	this.emp_salary=emp_salary;
}
public int getEmp_id() {
	return emp_id;
}

public String getEmp_name() {
	return emp_name;
}

public double getEmp_salary() {
	return emp_salary;
}

public double calculateSalary(double pf , double bonus){
	emp_salary= this.getEmp_id()-pf+bonus;
	return emp_salary;
}
public void display(double salary) {
	// TODO Auto-generated method stub
	System.out.println(this.getEmp_id());
	System.out.println(this.getEmp_name());
	System.out.println(salary);
}
}
