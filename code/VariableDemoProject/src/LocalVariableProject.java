
public class LocalVariableProject {
	
	public static void main(String[] args) {
		
		int i=56;
		LocalVariableProject demo = new LocalVariableProject();
		int a = 10;
		int b= 20;
		demo.add(a,b);
		i= 30;
		System.out.println(i);//30 
		
	}

	void add (int a, int b) {
		int c = a + b;		
		System.out.println(c); //30
	}
}
