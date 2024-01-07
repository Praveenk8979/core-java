package Object_Progrm;

public class MethodOverloading {
	void add(int a,int b) {
		int c=a+b;
		System.out.println("The sum of two number "+c);
	}
	void add(int a,int b,int c) {
		int d=a+b+c;
		System.out.println("Te sum of three number "+d);
	}

	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.add(20, 30);
		m.add(20, 30, 40);

	}

}
