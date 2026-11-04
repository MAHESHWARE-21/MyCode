package module1;

import java.util.Scanner;

public class ScannerProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
       int a=	sc.nextInt();
       System.out.println("please enter value of a");
       int b=	sc.nextInt();
       int sum=a+b;
       System.out.println(sum);
       sc.close();
	}

}
