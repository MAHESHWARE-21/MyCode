package module2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayprogramatRuntime {

	public static void main(String[] args)
	{
		
int rollno[]=new int [4];
Scanner sc=new Scanner(System.in);
rollno[0]=sc.nextInt();
rollno[1]=sc.nextInt();
rollno[2]=sc.nextInt();
rollno[3]=sc.nextInt();
System.out.println(Arrays.toString(rollno));
sc.close();
	}
	

}
