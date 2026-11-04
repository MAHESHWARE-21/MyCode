package module1;

public class Duplicateconstructor {
	Duplicateconstructor(){
		System.out.println("null constructor");
	}
Duplicateconstructor(int a){
		System.out.println("numbers");
	}

	public static void main(String[] args) {
		 new Duplicateconstructor(100);
		 new Duplicateconstructor();
	}

}
