package Encapsulation;
//use 2- this keyword used to invoke current class method(implicitly).
class Tests{
	void display() {
		System.out.println("Hello Praveen");
	}
	void show() {
		//display();
		this.display();
	}
}
public class ThisKeyword1 {

	public static void main(String[] args) {
            Tests s=new Tests();
            s.show();
	}

}
