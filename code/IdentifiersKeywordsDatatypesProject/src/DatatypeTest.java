
public class DatatypeTest {
	
	byte b1; 
	
	public static void main(String[] args) {
		byte b0 = 0; //valid
		byte b1 = 127; //valid
		byte b2 = -128; // valid
		
//		byte b3 = 131; // invalid value greater than 127
		byte b3 = (byte) 131;// valid, typecasting done so it will give -125
//		byte b4 = -129; //invalid
//		byte b5 = true; //invalid
		System.out.println(b3);

		byte b; // invalid as its not initialized
//		System.out.println(b); // error
		b = 1; // here assigned value so we are okay with it.
		System.out.println(b);
		
//		DatatypeTest d = new DatatypeTest();
//		System.out.println(d.b1); 
	}
}
