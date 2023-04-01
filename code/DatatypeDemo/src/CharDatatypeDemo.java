
public class CharDatatypeDemo {
	public static void main(String[] args) {
		char ch = '8'; // valid
//		char ch2 = a; // invalid (value must be inside single quote)
//		char ch3 = true; // invalid (only accepts char value, not boolean)
		char ch4 = 36; // valid (provides ascii value/symbol)
		System.out.println(ch + ch4);  // 8+54 = 62 >> 62 is ascii value of 98
//		ascii table: https://www.rapidtables.com/code/text/ascii-table.html
		
//		char ch5 = 'ab'; // invalid	(accepts only one letter)
		
		char ch6 = '9';
		char ch7 = 97;
		System.out.println(ch6); // valid
		System.out.println(ch7); // valid
	}
}
