package module2;

public class IfstringisPalindrome {

	public static void main(String[] args) {
		String input="mom";
		String output="";
		for(int i=input.length()-1;i>=0;i--) {
		char c1=	input.charAt(i);
		output=output+c1;
		
		}
		System.out.println(output);
	
	if(input.equalsIgnoreCase(output)) {
		System.out.println("its a palindrome");
	}
	else
	{
		System.out.println("its not a palindrome");
	}
}
}
