// this is a keyword in java
// it always points to current object
// access specifier : private, public, protected, no-specifier(package level)
// private member : is accessible only within the same class
public class Emp {
	//instance variables (state)
	 int empId;
	private String empName;
	private String deptName;
	
	public void setDetails(int id, String name, String dept) {
		//if(id < 0 ) throw new RuntimeException("EmpId can not be negative");
		empId = id;
		empName = name;
		deptName = dept;
	}
	
	// instance methods
	public void displayDetails() {
		System.out.println(this.empId +" "+ this.empName +" "+ this.deptName); 
	}
	
	public void setEmpId(int id) {
		empId = id;
	}
}



