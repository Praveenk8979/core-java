package Object_Progrm;

public class ByMethod {
	String color="White";
	//by method
	void help() {
		System.out.println("Helping 2000 people");
	}

	public static void main(String[] args) {
		ByMethod b=new ByMethod();
		ByMethod m=new ByMethod();
		System.out.println(b.color);
		m.help();
		
	}

}
