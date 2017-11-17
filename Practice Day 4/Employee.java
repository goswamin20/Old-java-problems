
public class Employee {
	private int empId;
	private String empName, desingnation, contactNumber, treeName;
	public Employee(int empId, String empName, String desingnation,
			String contactNumber, String treeName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.desingnation = desingnation;
		this.contactNumber = contactNumber;
		this.treeName = treeName;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String getDesingnation() {
		return desingnation;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public String getTreeName() {
		return treeName;
	}
	
}
