package Polymorphism;

public class AutoPoly {
	void show(int a) {
		System.out.println("Int Method");
	}
	void show(String a) {
		System.out.println("String Method");
	}

	public static void main(String[] args) {
		AutoPoly a=new AutoPoly();
		//a.show(10);
        a.show("Praveen");
	}

}
