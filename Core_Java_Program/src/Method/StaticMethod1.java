package Method;

public class StaticMethod1 {
	static void display() {
		System.out.println("1");
	}
}

class XYZ {
	static void show() {
		System.out.println("2");
	}

	public static void main(String[] args) {
		// StaticMethod1 s=new StaticMethod1();
		StaticMethod1.display();
		XYZ.show();
	}

}
