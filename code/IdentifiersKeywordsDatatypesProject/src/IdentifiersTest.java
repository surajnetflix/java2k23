
public class IdentifiersTest {
	public static void main(String[] args) {
//		int _ =10; //invalid (its working but not a good practice to use.)
		
		int a0 = 10; //valid
		
//		int digit=10;//valid
		int Digit;// valid but if you use it (like print) it will through error
		// since this is local variable it should be initialized.
//		System.out.println(Digit); //will give error
		Digit = 10;
		System.out.println(Digit); //will not give error as value has been assigned above
		
		boolean flag =true;
		
		System.out.println(flag);
		
	}

}
