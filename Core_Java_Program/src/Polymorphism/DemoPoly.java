package Polymorphism;

public class DemoPoly {
	void demo(int a, String b) {
		System.out.println(1);
	}
	void demo(String a, int b) {
		System.out.println(2);
	}

	public static void main(String[] args) {
		DemoPoly p=new DemoPoly();
		//p.demo(10, "Praveen");
		p.demo("Pra", 10);

	}

}
