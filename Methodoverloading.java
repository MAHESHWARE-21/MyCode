package module1;

public class Methodoverloading {
	static void add() {
		System.out.println("null");

	}
	static void add(int a) {
		System.out.println(10);

	}

	public static void main(String[] args) {
		add();
		add(10);

	}

}
