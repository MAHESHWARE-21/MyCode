package module2;

public class CountofNumeric {
	static int countofnumeric;

	public static void main(String[] args) {
		String s1="k v no banglore 1234";
	char[]c1=	s1.toCharArray();
for(int i=0;i<c1.length;i++) {
	boolean b1=Character.isDigit(c1[i]);
	if(b1) {
		countofnumeric++;
	}
}
System.out.println(countofnumeric);
	}

}
