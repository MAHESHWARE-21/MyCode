package module2;

import java.util.Arrays;

public class NotAnagramprogram {

	public static void main(String[] args) {
		String s1="car";
		String s2="dad";
		if(s1.length()!=s2.length()) {
			System.out.println("they are not anagram");
		}
		else {
		char[] c1=	s1.toCharArray();
		char[] c2=	s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
	System.out.println(Arrays.toString(c1));
	System.out.println(Arrays.toString(c2));
	if(Arrays.equals(c1, c2)) {
		System.out.println("anagram");
	}
	else {
		System.out.println("not anagram");
	}
		}
		
	}

}
