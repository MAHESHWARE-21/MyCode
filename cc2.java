package module2;
abstract  class ac1{
	abstract void  m1();
	abstract void  m2();

 
 static void method1() {
	 System.out.println();
 }
  void method2() {
	 System.out.println();
 }

public class cc2 extends ac1 {

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
}
