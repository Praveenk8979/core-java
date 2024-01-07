package Object_Progrm;

public class MultipleJ {
	MultipleJ(int a, int b){
		int c=a*b;
		System.out.println(c);
	}
	MultipleJ(double a, double b){
		double d=a*b;
		System.out.println(""+d);
	}

	public static void main(String[] args) {
		new MultipleJ(10,20);
		new MultipleJ(10.50,10.50);
	}

}
