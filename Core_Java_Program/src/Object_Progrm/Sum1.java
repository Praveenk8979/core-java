package Object_Progrm;

public class Sum1 {
	void sum(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	void sum(double a, double b) {
		double d=a+b;
		System.out.println(""+d);
	}

	public static void main(String[] args) {
		Sum1 s=new Sum1();
		s.sum(250, 350);
		s.sum(10.50, 19.50);
	}

}
