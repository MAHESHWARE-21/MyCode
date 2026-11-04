package module2;

public class StringMethods2 {

	public static void main(String[] args) {
		String a="ram123 kumarASD tiwari567";
	//System.out.println(a.replace('r', 'R'));
System.out.println(a.replaceAll("[A-Z]","*"));
System.out.println(	a.matches("r(.*)"));
	
		
	}

}
