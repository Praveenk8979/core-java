package Overriding;
//overriding and Exception handling

class Tests{
	void show() throws RuntimeException{
		System.out.println(1);
	}
}
public class Case3 extends Tests {
	void show() {
		System.out.println(2);
	}

	public static void main(String[] args) {
		Tests s=new Tests();
		s.show();
		Case3 a=new Case3();
		a.show();
		
	}

}
