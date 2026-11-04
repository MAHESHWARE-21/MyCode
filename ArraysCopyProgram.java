package module2;

import java.util.Arrays;

public class ArraysCopyProgram {

	public static void main(String[] args) {
		int[]rollnoA=new int[5];
		rollnoA[0]=12;
		rollnoA[1]=23;
		rollnoA[2]=45;
		rollnoA[3]=65;
		rollnoA[4]=43;
		int rollnoB[]=new int [rollnoA.length];
		for(int i=0;i<rollnoA.length;i++) {
		System.out.println(Arrays.toString(rollnoA));	
		}
	}
		
	}


