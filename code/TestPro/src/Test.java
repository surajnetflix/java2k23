class Test {
	public static void main(String[] args) {
		System.out.println("hello Test");
		
		Sample s = new Sample();
		
		System.out.println("end");
	}
}


// Unable to understand this class and method(not sure whether its a method or not).
class Sample {

	static {
		System.out.println("hello Sample");
	}
}