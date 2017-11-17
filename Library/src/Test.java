public class Test{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e= new Employee(1, "nandini", 500.00);
		double salary =  e.calculateSalary(5, 2);
		e.display(salary);
	}

}
