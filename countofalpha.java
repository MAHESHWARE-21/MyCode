package module2;

public class countofalpha {
static int countofalpha=0;
	public static void main(String[] args) {
		String s1="k v no 123 banglore ";
	char []c1=s1.toCharArray();
for(int i=0;i<c1.length;i++) {
boolean b1=Character.isAlphabetic(c1[i]);
if(b1) {
	countofalpha++;

}
}
System.out.println(countofalpha);
	}

}
