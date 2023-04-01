
public class NumericDatatypeDemo {
	//entry point for jvm
	public static void main(String[] args) {
	//		short - 2 bytes
	//		int - 4 bytes
	//		long - 8 bytes
	//		float - 4 bytes
	//		double - 8 bytes
		
//--------------- short data -------------------------
			short s1 = 32767;  //valid
			short s2 = -32767; //valid
//			short s3 = -32769; //invalid
//			short s4 = true; // invalid
//			System.out.println(s4);

//------------------- int data ---------------------
//			int i = 2147483648; //invalid
			int i2 = -2147483647; //valid
			int i3 = 2147483646; // valid
			int i4 = 0;  //valid
//			int i5 = false; // invalid
//			System.out.println(i4);
			
//-------------- long data -------------------
			long a = 256456564565613465L; //valid
			long A2 = 2345678991L; //valid
			long a3 = 123456789; //valid
//			long a4 = 9234567890; // invalid
			long a4 = 9234567890L; //valid
			long mobileNo = 9876543234L;		
//			System.out.println(mobileNo);
		
			long s9 = (2^6); //this is giving unexpected output, not sure of ^
//			System.out.println(s9);

//------------ float data ------------------------
			float f1 = 89;//valid
//			float f2 = 89.9; //not valid === 4 byte 
			float f3 = 89.9f;//valid
			float f4 = 89.123456789f;
//			System.out.println(f4);
//			
//-------------- double data ---------------------
			double d1 = 45; //valid
			double d2 = 45.9; //valid ====>8 byte 
			double d3 = 45.9d; //valid
			double d4 = 45.123456789d;
//			System.out.println(d4);
			
			System.out.println("f4=="+f4);
			System.out.println("d4=="+d4);
	}

}
