package collection;


import java.util.HashSet;
import java.util.TreeSet;

import java.util.Set;

public class EmployeeTest {
public static void main(String[] args) {
	Employee e= new Employee(2, "nandini");
	Employee e1= new Employee(1, "monika");
	Employee e2= new Employee(4, "kuhu");
	Employee e3 = new Employee(7, "sakshi");
	
	Set<Employee> s;
	s= new HashSet<Employee>() ;
	s.add(e);
	s.add(e1);
	s.add(e2);
	s.add(e3);
	System.out.println("HashSet:"+s);
	
	s= new TreeSet<Employee>( new NameComparator());
	s.add(e);
	s.add(e1);
	s.add(e2);
	s.add(e3);
	System.out.println("TreeSet:"+s);
	
	}}