
public class LocalVariableProject2 {
	
	int i ; 
	
	public static void main(String[] args) {
		
		int i=56;
		LocalVariableProject2 demo = new LocalVariableProject2();
		
		System.out.println("local variable = "+i); //56
		System.out.println("global variable = "+demo.i); // 0
		
	}

}
