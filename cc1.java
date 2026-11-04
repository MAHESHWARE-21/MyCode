package module2;
abstract class a1{
	abstract void m1();
	abstract void  m2();
}

public class cc1 extends a1{

	public static void main(String[] args) {
	}	
	

	@Override
	void m1() {
		System.out.println("logic 1");
		
	}

	@Override
	void m2() {
		System.out.println("logic 2");
		
	}

}

