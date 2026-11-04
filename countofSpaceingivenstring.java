package module2;

public class countofSpaceingivenstring {
 static int countofspace;
	public static void main(String[] args) {
	String s1="k v no banglore 123";
	char []c1=s1.toCharArray();
for(int i=0;i<c1.length;i++) {
	boolean b1=Character.isWhitespace(c1[i]);
	if(b1) {
		countofspace++;
	}
}
System.out.println(countofspace);
	}

}
