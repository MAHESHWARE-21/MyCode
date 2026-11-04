package module2;

public class StringMethods1 {

	public static void main(String[] args) {
		String a="ramkumar tiwari";
	String	firstname=a.substring(0, 3);
	String middlename=a.substring(4, 9);
	String lastname=a.substring(a.length()-6);
		System.out.println(firstname);
		System.out.println(middlename);
		System.out.println(lastname);
	System.out.println(a.substring(2, 7));
	System.out.println(a.contains("tiwari"));
System.out.println(	a.matches("(.*)i"));
		
	}

}
