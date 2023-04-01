
public class Employee {
	
	private int empId; //declaration of global variable
	public String empName;
	String companyName;
	protected String address;
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.empId = 101 ;
		emp1.empName = "Arun"; 
		
		Employee emp2 = new Employee();
		emp2.empId = 201 ;
		emp2.empName = "Arun"; 
		
		System.out.println(emp1.empId);
		System.out.println(emp2.empId);
//		System.out.println(Employee.companyName); 
		// Not sure why I am unable to access default value
		// with the class name.
	}
}
