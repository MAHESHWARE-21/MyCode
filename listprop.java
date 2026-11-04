package module2;

import java.util.ArrayList;
import java.util.List;

public class listprop {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(12);
		l1.add(23);
		l1.add(45);
		l1.add(54);
		System.out.println(l1);
		
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(12);
		l2.add(43);
		l2.add(43);
		l2.add(98);
		System.out.println(l2);

	}

}
