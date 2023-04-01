
public class GlobalVariableTest3 {
	int x ;
	
	public static void main(String[] args) {
		GlobalVariableTest3 test  = new GlobalVariableTest3();
		test.x = 100;
		
		GlobalVariableTest3 test2 = new GlobalVariableTest3();
		
		
		System.out.println("test.x="+test.x  ); //100
		System.out.println("test2.x="+test2.x  ); //0

	}

}
