package module2;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		int array1[]=new int[5];
		array1[0]=12;
		array1[1]=23;
		array1[2]=43;
		array1[3]=42;
		array1[4]=54;
		int array2[]=new int[array1.length];
		array2[4]=array1[0];
		array2[3]=array1[1];
		array2[2]=array1[2];
		array2[1]=array1[3];
		array2[0]=array1[4];
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}

}
