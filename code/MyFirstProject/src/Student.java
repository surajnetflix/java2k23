
public class Student {
	
	int sId;
	String sName;
	long contactNo;
	
	public static void main(String[] args) {
		//className objectName = new className();
		Student suresh = new Student();
		suresh.sId = 102;
		suresh.sName = "Suresh Patil";
		suresh.contactNo = 8738788566L;
		
		System.out.println("Student Id="+suresh.sId);
		System.out.println("Student Name="+suresh.sName);
		System.out.println("Contact No.="+suresh.contactNo);
		
		System.out.print("Student Id="+suresh.sId+" Student Name="+suresh.sName);
		
		//H.w. - Student details 
		Student reema = new Student();	
	}
}
