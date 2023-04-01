
public class GlobalVariableTest2 {
	int x;
	char ch;
	
	public static void main(String[] args) {
		GlobalVariableTest2 test  = new GlobalVariableTest2();
		test.x = 100;//4 byte
		
		GlobalVariableTest2 test2 = new GlobalVariableTest2();
		GlobalVariableTest2 test3 = new GlobalVariableTest2();
		GlobalVariableTest2 test4 = new GlobalVariableTest2();
	
		System.out.println("test.x="+test.x ); //100
		System.out.println("test2.x="+test2.x ); //0 
		System.out.println("test.x="+test3.x ); //0
		System.out.println("test2.ch="+test4.ch +"end"); // empty char (one space) 

	}

}
