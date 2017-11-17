package Inheritance;

public class InheritanceMain {
public static void main(String[] args) {
	Person p= new Person(14,"nandini");
	p.setAge(14);
	p.setName("dj");
	Employee e= new Employee(30," ","ceo",1);
	e.setAge(30);
	e.setName("arohi");
	e.setEmpId(1);
	e.setDesignation("ceo");
	Student s= new Student(13,"aviral", "cse", 18);
	s.setDept("cse");
	s.setAge(18);
	s.setName("avril");
	s.setRollNo(5);
System.out.println(p);
System.out.println(e);
System.out.println(s);
}
}
