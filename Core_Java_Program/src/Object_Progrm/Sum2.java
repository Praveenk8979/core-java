package Object_Progrm;
//constructor overloading
public class Sum2 {
	Sum2(int a,int b){
		int c=a+b;
		System.out.println(c);
	}
	Sum2(double a, double b){
		double d=a+b;
		System.out.println(""+d);
	}

	public static void main(String[] args) {
		new Sum2(10,20);
		new Sum2(10.50,14.50);

	}

}
