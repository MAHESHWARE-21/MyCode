package module2;

public class palindromeexample3 {

	public static void main(String[] args) {
		String input="dad";
		String output="";
		for(int i=input.length()-1;i>=0;i--) {
		char c1=	input.charAt(i);
		output=output+c1;
		
		}
		System.out.println(output);
	
	if(input.equals(output)) {
		System.out.println("its a palindrome");
	}
	else {
		System.out.println("its not palindrome");
	}
}
}
