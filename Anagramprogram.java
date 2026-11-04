package module2;

import java.util.Arrays;

public class Anagramprogram {

	public static void main(String[] args) {
		String s1="act";
		String s2="cat";
		if (s1.length()!=s2.length()) {
			System.out.println("not anagram");	
		}
		else {
			char[] c1=s1.toCharArray();
			char c2[]=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
if(Arrays.equals(c1, c2)) {
	System.out.println("they are anagram");
}
else {
	System.out.println("not anagram");
}
	}
}

	
}
